package la.moes.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.FactsEventData;
import org.adempiere.base.event.IEventTopics;
import org.adempiere.exceptions.FillMandatoryException;
import org.adempiere.model.POWrapper;
import org.compiere.model.I_AD_Org;
import org.compiere.model.I_C_Location;
import org.compiere.model.I_GL_Journal;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MJournal;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MRequisitionLine;
import org.compiere.model.MSysConfig;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.X_AD_Org;
import org.compiere.model.X_AD_SysConfig;
import org.compiere.model.X_GL_Journal;
import org.compiere.process.ProcessCall;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.osgi.service.event.Event;
import org.compiere.util.Msg;

import la.moes.model.I_AD_OrgPosition;
import la.moes.model.I_GL_JournalPay;
import la.moes.model.I_GL_JournalPay_PD;
import la.moes.model.I_GL_JournalPay_R;
import la.moes.model.I_GL_JournalRef;
import la.moes.model.I_TH_GL_Jn_template_Line;
import la.moes.model.MGL_JournalRef;
import la.moes.model.X_AD_OrgPosition;
import la.moes.model.X_GL_JournalPay;
import la.moes.model.X_GL_JournalPay_PD;
import la.moes.model.X_GL_JournalPay_R;
import la.moes.model.X_GL_JournalRef;
import la.moes.model.X_TH_GL_Jn_template;
import la.moes.process.GLJournalMoES;
import javax.swing.JOptionPane;


//import th.motive.kls.asset.model.X_KLS_FA_Transfer;


public class LA_DocEvent extends AbstractEventHandler  {
	//private Integer GL_Journal_ID;
		//private Integer GL_JournalRef_ID;
		CLogger log = CLogger.getCLogger(LA_DocEvent.class);
		private int provice_id;
		//private int Approve_No;
		
		private int i = 1;
		
		//private X_AD_SysConfig mTab;
		
		private String po_after_new = "adempiere/po/afterNew";
		private BigDecimal AmountBF;
		private JOptionPane producer;
		private String result;
		
	@Override protected void initialize() {
		// TODO Auto-generated method stub

		registerTableEvent(IEventTopics.DOC_BEFORE_COMPLETE , X_GL_Journal.Table_Name);
		
		registerTableEvent(IEventTopics.PO_BEFORE_CHANGE, X_AD_OrgPosition.Table_Name);
		registerTableEvent(IEventTopics.PO_BEFORE_NEW, X_AD_OrgPosition.Table_Name);
		registerTableEvent(IEventTopics.PO_AFTER_NEW , X_AD_OrgPosition.Table_Name);
		log.info("<PLUGIN> doc event is ok!!!!!");
	}
	
	@Override
	protected void doHandleEvent(Event event) {
		// TODO Auto-generated method stub
		String type = event.getTopic();
		log.warning(type);
		
		
		//FactsEventData fed = getEventData(event);
		//po = fed.getPo();
		
		PO po = getPO(event);
		 i = 1;
		//log.info(po.get_TableName() + " Type: "+type);
		 
		 if (po instanceof MJournal && type.equals(IEventTopics.DOC_BEFORE_COMPLETE)) {
			 I_GL_Journal bpl = POWrapper.create(po,I_GL_Journal.class);
			 	//BigDecimal som = ;
				Integer GL_Journal_ID = bpl.getGL_Journal_ID();
				Integer AD_Client_ID = bpl.getAD_Client_ID();
				Integer AD_Org_ID = bpl.getAD_Org_ID();
				Integer GL_Budget_ID = bpl.getGL_Budget_ID();
				
				String Find_Control_Amount = "SELECT ControlAmt FROM GL_Journal where GL_Journal_ID=? ";
				BigDecimal Control_Amount = DB.getSQLValueBDEx(null, Find_Control_Amount, GL_Journal_ID);
			
				String Findsum_AmountRef = "SELECT coalesce(sum(Amount),0) FROM GL_JournalRef where GL_Journal_ID=? ";
				BigDecimal sum_AmountRef = DB.getSQLValueBDEx(null, Findsum_AmountRef, GL_Journal_ID);
				
					
				String Findsum_AmountPay = "SELECT coalesce(sum(Amount),0) FROM GL_JournalPay where GL_Journal_ID=? ";
				BigDecimal sum_AmountPay = DB.getSQLValueBDEx(null, Findsum_AmountPay, GL_Journal_ID);
				
				String Findsum_AmountPay_PD = "SELECT coalesce(sum(Amount),0) FROM GL_JournalPay_PD where GL_Journal_ID=? ";
				BigDecimal sum_AmountPay_PD = DB.getSQLValueBDEx(null, Findsum_AmountPay_PD, GL_Journal_ID);
				
				String Findsum_AmountPay_R = "SELECT coalesce(sum(Amount),0) FROM GL_JournalPay_R where GL_Journal_ID=? ";
				BigDecimal sum_AmountPat_R = DB.getSQLValueBDEx(null, Findsum_AmountPay_R, GL_Journal_ID);
				
				if (sum_AmountRef.compareTo(BigDecimal.ZERO) > 0)  {
					if (sum_AmountRef.compareTo(Control_Amount) > 0) {
						throw new AdempiereUserError("Total Invoice amount > Control amount ");
					}
					if (sum_AmountRef.compareTo(Control_Amount) < 0) {
						throw new AdempiereUserError("Total Invoice amount < Control amount ");
					}
				}
				if (sum_AmountPay.compareTo(BigDecimal.ZERO) > 0)  {
					if (sum_AmountPay.compareTo(Control_Amount) > 0) {
						throw new AdempiereUserError("Total payment amount > Control amount ");
					}
					if (sum_AmountPay.compareTo(Control_Amount) < 0) {
						throw new AdempiereUserError("Total Payment amount < Control amount ");
					}
				}
				if (sum_AmountPay_PD.compareTo(BigDecimal.ZERO) > 0)  {
					if (sum_AmountPay_PD.compareTo(Control_Amount) > 0) {
						throw new AdempiereUserError("Total payment PD amount > Control amount ");
					}
					if (sum_AmountPay_PD.compareTo(Control_Amount) < 0) {
						throw new AdempiereUserError("Total payment PD amount < Control amount ");
					}
				}
				if (sum_AmountPat_R.compareTo(BigDecimal.ZERO) > 0)  {
					if (sum_AmountPat_R.compareTo(Control_Amount) > 0) {
						throw new AdempiereUserError("Total payment R amount > Control amount ");
					}
					if (sum_AmountPat_R.compareTo(Control_Amount) < 0) {
						throw new AdempiereUserError("Total payment R amount < Control amount ");
					}
				}
				//ตัวเลขอนุมัติที่ตั้งไว้
				String Find_TotalDr = "SELECT gl.TotalDr  \n"
						+ "FROM adempiere.GL_Journal gl \n"
						+ "WHERE gl.DocStatus='CO' AND gl.PostingType='B' AND gl.GL_Budget_ID=?	\n"
						+ "AND gl.AD_Client_ID=? AND gl.AD_Org_ID=?";
				BigDecimal TotalDr = DB.getSQLValueBDEx(null, Find_TotalDr, GL_Budget_ID, AD_Client_ID, AD_Org_ID);
				//ตัวเลขที่มีการตั้งหนี้ ในแต่ละครั้งต้องอ้างอิงถึงใบนุมัติ(GL_Journal_Budget_ID) ใบอนุมัติ1ใบอ้างอิงได้หลายครั้ง
				String Find_GL_AmountRef = "SELECT SUM(rf.Amount )\n"
						+ "FROM adempiere.GL_JournalRef rf \n"
						+ "WHERE  rf.AD_Client_ID=? AND rf.AD_Org_ID=?\n"
						+ "GROUP BY rf.GL_Journal_Budget_ID \n"
						+ "ORDER BY rf.GL_Journal_Budget_ID ";
				BigDecimal Sum_GL_AmountRef = DB.getSQLValueBDEx(null, Find_GL_AmountRef, AD_Client_ID, AD_Org_ID);
				if (TotalDr.compareTo(Sum_GL_AmountRef) > 0)  {
					throw new AdempiereUserError("TotalDr > Sum_GL_AmountRef");
				}
				
		 }
		 
		 if (po.get_TableName().equals(X_AD_OrgPosition.Table_Name) && type.equals(IEventTopics.PO_AFTER_NEW)) {
			 //throw new AdempiereUserError("PO_AFTER_NEW ");
			 I_AD_Org org = POWrapper.create(po,I_AD_Org.class);
			 Integer Org_id = org.getAD_Org_ID();
			 String Find_Orgposition = "SELECT COUNT(Orgp.AD_Org_id) org  from AD_OrgPosition Orgp\n"
			 		+ "INNER JOIN AD_Org Org on Org.AD_Org_id=Orgp.AD_Org_id\n"
			 		+ "WHERE Org.AD_Org_id=? ";
			 BigDecimal Count_Orgposition = DB.getSQLValueBDEx(null, Find_Orgposition, Org_id);
			 if (Count_Orgposition.compareTo(BigDecimal.ZERO) > 0)  {
					throw new AdempiereUserError("Total position cannot > 1 record");
				}
		 }
		
	}
	
	protected void afterChange (PO po){
		if (po instanceof X_GL_JournalRef){												
			// when change ZK_BROWSER_TITLE, set web config to new value
			//if (MSysConfig.ZK_BROWSER_TITLE.equals(((X_AD_SysConfig) po).getName())){
				//String configAppname = ((X_AD_SysConfig) po).getValue();
				//webApp.setAppName(configAppname);
			}
	}
				

	private String get_TrxName() {
		// TODO Auto-generated method stub
		return null;
	}

}
