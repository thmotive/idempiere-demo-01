package la.moes.process;

import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;

import org.adempiere.model.GenericPO;
import org.adempiere.model.POWrapper;
import org.compiere.model.I_AD_Sequence;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;

import org.compiere.model.Query;
import org.compiere.model.X_GL_Journal;
import org.compiere.model.X_GL_JournalLine;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

import la.moes.model.X_TH_GL_Jn_template;
import la.moes.model.I_TH_GL_Jn_template;
import la.moes.model.I_TH_GL_Jn_template_Line;
import la.moes.model.X_TH_GL_Jn_template_Line;


import org.compiere.model.I_GL_JournalLine;




public class GLJournalMoES extends SvrProcess {
	boolean isOrgLevel = false;
	private Timestamp p_DateAcct =null;
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		ProcessInfoParameter[] para = getParameter();
		for (ProcessInfoParameter element : para){
			String name = element.getParameterName();
			if (I_AD_Sequence.COLUMNNAME_IsOrgLevelSequence.equals(name))
				isOrgLevel = element.getParameterAsBoolean();
			else
				if (log.isLoggable(Level.INFO))log.log(Level.INFO, "Unknown Parameter: " + name);
		}
		
	}
	
	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		X_TH_GL_Jn_template hdSrc = new X_TH_GL_Jn_template (Env.getCtx(), getRecord_ID(), get_TrxName());
		
		
		// Destination or new header
		MJournal hdnew = new MJournal (getCtx(), 0, get_TrxName());
		
	//X_GL_Journal_Moes scanHeader = new X_GL_Jourp_C_RfQ_IDnal_Moes(getCtx(), getRecord_ID(), null);
		//X_C_InvoiceLine hdnew1 = new  X_C_InvoiceLine(getCtx(), getRecord_ID(), get_TrxName());
		//X_C_Invoice hdSrc1 = new X_C_Invoice (getCtx(), 0, get_TrxName());
		p_DateAcct = new Timestamp (System.currentTimeMillis());
		
		
		hdnew.setAD_Org_ID(hdSrc.getAD_Org_ID());
		hdnew.setC_ConversionType_ID(hdSrc.getC_ConversionType_ID());
		hdnew.setC_AcctSchema_ID(hdSrc.getC_AcctSchema_ID());
		hdnew.setC_ConversionType_ID(hdSrc.getC_ConversionType_ID());
		hdnew.setC_Currency_ID(hdSrc.getC_Currency_ID());
		hdnew.setC_DocType_ID(hdSrc.getC_DocType_ID());
		hdnew.setDocAction(DocAction.ACTION_Complete);
		hdnew.setCurrencyRate(hdSrc.getCurrencyRate());
		hdnew.setDateAcct(p_DateAcct);
		hdnew.setDateDoc(p_DateAcct);
		hdnew.setDescription(hdSrc.getDescription());
		//must be auto run doc no
		//hdnew.setDocumentNo(hdSrc.getDocumentNo());
		
		hdnew.setDocStatus(DocAction.STATUS_Drafted);
		hdnew.setGL_Category_ID(hdSrc.getGL_Category_ID());
		hdnew.setPostingType(hdSrc.getPostingType());
		//hdnew.setDocStatus("DR");
		hdnew.setGL_Category_ID(hdSrc.getGL_Category_ID());
		//hdnew.setIsActive("Y");
		//hdnew.setIsApproved("Y");
		//hdnew.IsPrinted("N");
		//hdnew.setPosted("N");
		//hdnew.setTotalCr(hdSrc.getTotalCr());
		//hdnew.setTotalDr(hdSrc.getTotalDr());
		int C_Period_ID = MPeriod.getC_Period_ID(getCtx(), p_DateAcct, hdSrc.getAD_Org_ID());
		hdnew.setC_Period_ID(C_Period_ID);
		//hdnew.setGL_Journal_ID(hdSrc.getTH_GL_Jn_template_ID());
		//hdnew.setGL_Journal_UU(hdSrc.getTH_GL_Jn_template_UU());
		hdnew.saveEx();

		StringBuilder sqlD = new StringBuilder("SELECT * FROM TH_GL_Jn_template_Line  WHERE TH_GL_Jn_template_ID = ").
				append(getRecord_ID());
		
		DB.executeUpdate(sqlD.toString(), get_TrxName());

		//Query GL_Jn_template_line = null;
		//String scanDetailWhere = String.format("%s = ?", I_TH_GL_Jn_template_Line.COLUMNNAME_TH_GL_Jn_template_ID);	
				//String scanDetailWhere = String.format("%s = ? AND %s = '%s'", I_TH_FA_Scan_Detail.COLUMNNAME_TH_FA_Scan_ID, 
						//I_TH_FA_Scan_Detail.COLUMNNAME_TH_FA_Physical_Status, X_TH_FA_Scan_Detail.TH_FA_PHYSICAL_STATUS_KeepInAnotherLocation);
		//GL_Jn_template_line = new Query(getCtx(), I_TH_GL_Jn_template_Line.Table_Name, I_TH_GL_Jn_template_Line.COLUMNNAME_TH_GL_Jn_template_ID + " = " + hdSrc.getTH_GL_Jn_template_ID(), get_TrxName());
		
		//List<X_TH_GL_Jn_template_Line> scanDetails = new Query(getCtx(), I_TH_FA_Scan_Detail.Table_Name, scanDetailWhere, get_TrxName()).setParameters(faScan.getTH_FA_Scan_ID()).list();	
		//List<X_TH_GL_Jn_template_Line> tpls = new Query(getCtx(), I_TH_GL_Jn_template_Line.Table_Name, scanDetailWhere, get_TrxName()).setParameters(hdSrc.getTH_GL_Jn_template_ID()).list();	

		Query querySourceLines = new Query(getCtx(), X_TH_GL_Jn_template_Line.Table_Name, X_TH_GL_Jn_template_Line.COLUMNNAME_TH_GL_Jn_template_ID + " = ?" , get_TrxName());
		List<GenericPO> tpls = querySourceLines.setParameters(hdSrc.getTH_GL_Jn_template_ID()).list();
		//List<X_TH_GL_Jn_template_Line> tpls = GL_Jn_template_line.list();
		//1000005
		int lineNo = 10;
		
		for (GenericPO tpl : tpls) {
			// Insert line details
			I_TH_GL_Jn_template_Line DetSrc = POWrapper.create(tpl, I_TH_GL_Jn_template_Line.class);
			insertDetail(DetSrc,hdnew,lineNo);
			lineNo += 10;
		}
		
		return null;
	}
	

	private void insertDetail(I_TH_GL_Jn_template_Line DetSrc, MJournal hdnew, int lineNo) {
		// TODO Auto-generated method stub
		//X_TH_GL_Jn_template_Line DetSrc = new X_TH_GL_Jn_template_Line (getCtx(), 0, get_TrxName());
		MJournalLine Detail = new MJournalLine(hdnew);
		Detail.setLine(lineNo);
		
		//header ID
		Detail.setGL_Journal_ID(hdnew.getGL_Journal_ID()); 
		
		//Detail
		Detail.setAccount_ID(DetSrc.getAccount_ID());
		Detail.setAD_Org_ID(DetSrc.getAD_Org_ID());
		Detail.setAmtAcctCr(DetSrc.getAmtAcctCr());
		Detail.setAmtAcctDr(DetSrc.getAmtAcctDr());
		Detail.setAmtSourceCr(DetSrc.getAmtSourceCr());
		Detail.setAmtSourceDr(DetSrc.getAmtSourceDr());
		Detail.setC_Currency_ID(DetSrc.getC_Currency_ID());
		Detail.setDescription(DetSrc.getDescription());
		//Detail.setLA_SourceFund_ID(DetSrc.getLA_SourceFund_ID());
		//Detail.setLA_SubSector_ID(DetSrc.getLA_SubSector_ID());
		Detail.saveEx();
	}

	/*private void insertDetail(I_TH_GL_Jn_template_Line DetSrc ,MJournal hdnew, int lineNo) {
		//X_GL_JournalLine Detail = new X_GL_JournalLine (getCtx(), 0, get_TrxName());
		// Create the journal lines
		MJournalLine Detail = new MJournalLine(hdnew);
		Detail.setLine(lineNo);
		//lineNo += 10;
		
		//Detail.setC_Invoice_ID(hd.getC_Invoice_ID());
		
		//set ID from Header of newly created GL journal
		Detail.setGL_Journal_ID(hdnew.getGL_Journal_ID()); 
		
		Detail.setAccount_ID(DetSrc.getAccount_ID());
		Detail.setAD_Org_ID(DetSrc.getAD_Org_ID());
		Detail.setAmtAcctCr(DetSrc.getAmtAcctCr());
		Detail.setAmtAcctDr(DetSrc.getAmtAcctDr());
		Detail.setAmtSourceCr(DetSrc.getAmtSourceCr());
		Detail.setAmtSourceDr(DetSrc.getAmtSourceDr());
		Detail.setC_Currency_ID(DetSrc.getC_Currency_ID());
		Detail.setDescription(DetSrc.getDescription());
		//Detail.setGL_JournalLine_ID(hd.getTH_GL_Jn_template_Line_ID());
		//Detail.setGL_JournalLine_UU(hd.getTH_GL_Jn_template_Line_UU());
		//Detail.setLine(hd.getLine());
		
		Detail.saveEx();
	}*/
	

}
