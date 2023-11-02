package la.moes.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.adempiere.webui.adwindow.ADWindow;
import org.adempiere.webui.session.SessionManager;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class gljournalcallout implements IColumnCallout {

	public static final Integer WINDOW_ID_GL_Journal_MoES = 1000031;
	
	
	
	private Integer GL_JournalRef_ID;
	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		
		Object winObj = SessionManager.getAppDesktop().findWindow(WindowNo);
		boolean isStandardWindow = (winObj != null && winObj instanceof ADWindow);

		 String windowname = mTab.getGridWindow().getName();

		Integer window_ID = mTab.getGridWindow().getAD_Window_ID();

		if (isStandardWindow && WINDOW_ID_GL_Journal_MoES.equals(window_ID))
				//|| WINDOW_ID_Product_Sunsui.equals(window_ID))
				{
				start1(ctx, WindowNo, mTab, mField, value, oldValue);
			}

		return null;
	}
	
	public String start1(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		
		GL_JournalRef_ID = (Integer) mTab.getValue("GL_JournalRef_ID");
		String columnname = mField.getColumnName();
		if (GL_JournalRef_ID == null) 
			return "";
		{

	//	String Findvalue = "select Value from M_Product where M_Product_ID=?";
	//	String valuecode = DB.getSQLValueString(null, Findvalue, M_Product_ID);
	//	mTab.setValue("Value", valuecode);
		// set color
		BigDecimal Amt = Env.ZERO;
		String FindAmount = "select Amount from GL_JournalRef where GL_JournalRef_ID=?";
		Amt = DB.getSQLValueBD(null, FindAmount, GL_JournalRef_ID);
		
		mTab.setValue("Amount", Amt);
		
		return null;
	    }
	}
}
