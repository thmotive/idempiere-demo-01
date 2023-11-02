package la.moes.callout;

import java.math.BigDecimal;
import java.util.Properties;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.util.DB;

public class paymentcallout implements IColumnCallout {

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value, Object oldValue) {
		// TODO Auto-generated method stub
		//Integer C_Payment_ID = (Integer) mTab.getValue("C_Payment_ID");
		//String FindC_Payment = "SELECT C_BankAccount_ID  FROM C_Payment where C_Payment_ID =? ";
		//BigDecimal C_BankAccount_ID = DB.getSQLValueBDEx(null, FindC_Payment, C_Payment_ID);
		Integer C_BankAccount_ID = (Integer) mTab.getValue("C_BankAccount_ID");
		//
		String FindC_Payment2 = "SELECT B_Asset_Acct  FROM C_BankAccount_Acct where C_BankAccount_ID =? order by C_AcctSchema_ID";
				 //and C_AcctSchema_ID=101";
		BigDecimal B_Asset_Acct = DB.getSQLValueBDEx(null, FindC_Payment2, C_BankAccount_ID);
		
		//combination search
		//B_Asset_Acct > C_ValidCombination_id
		//get account_id
		String FindC_Payment3 = "SELECT account_id  FROM c_validcombination where c_validcombination_id =? ";
		BigDecimal v_combine_accid = DB.getSQLValueBDEx(null, FindC_Payment3, B_Asset_Acct);
		//ad_client_id
		
		String FindC_Payment1 = "SELECT \n"
				+ "        SUM (amtacctdr-amtacctcr) AS amount\n"
				+ "FROM fact_acct fc\n"
				+ " INNER JOIN c_elementvalue el on el.c_elementvalue_id=fc.account_id \n"
				+ " WHERE fc.account_id =? \n"
				+ "GROUP BY  fc.account_id\n"
				+ "ORDER BY fc.account_id";
		BigDecimal C_Payment2 = DB.getSQLValueBDEx(null, FindC_Payment1, v_combine_accid);
		mTab.setValue("Description", C_Payment2);
		
		return null;
	}

}
