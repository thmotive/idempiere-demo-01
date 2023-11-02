package la.moes.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import la.moes.model.*;


public class moesModelFactory implements IModelFactory{

	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		if (tableName.equals(X_GL_JournalPay.Table_Name))
			return X_GL_JournalPay.class;
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// TODO Auto-generated method stub
		if (tableName.equals(X_GL_JournalPay.Table_Name))
			return new X_GL_JournalPay(Env.getCtx(), Record_ID, trxName);
		
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// TODO Auto-generated method stub
		if (tableName.equals(X_GL_JournalPay.Table_Name))
			return new X_GL_JournalPay(Env.getCtx(), rs, trxName);
		
		return null;
	}

}
