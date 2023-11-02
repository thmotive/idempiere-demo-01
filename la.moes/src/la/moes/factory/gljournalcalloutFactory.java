package la.moes.factory;

import org.adempiere.base.IColumnCallout;
import org.adempiere.base.IColumnCalloutFactory;
import org.compiere.model.X_C_Payment;
import org.osgi.service.component.annotations.Component;

import la.moes.callout.gljournalcallout;
import la.moes.callout.paymentcallout;
import la.moes.model.X_GL_JournalPay;

@Component(
		 property= {"service.ranking:Integer=2"}
		 )

public class gljournalcalloutFactory implements IColumnCalloutFactory{


	
	@Override
	public IColumnCallout[] getColumnCallouts(String tableName, String columnName) {
		// TODO Auto-generated method stub
		if (tableName.equals(X_GL_JournalPay.Table_Name) && columnName.equals(X_GL_JournalPay.COLUMNNAME_GL_JournalRef_ID)) {
			//GL_JournalRef_ID

			return new IColumnCallout[] { new gljournalcallout() };
		}
		if (tableName.equals(X_GL_JournalPay.Table_Name)) {

			return new IColumnCallout[] { new gljournalcallout() };
		}
		if (tableName.equals(X_C_Payment.Table_Name)) {

			return new IColumnCallout[] { new paymentcallout() };
		}
		
		return null;
	}

}
