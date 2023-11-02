package la.moes.model;

import java.util.Properties;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.util.CLogger;
import org.compiere.util.DB;

public class MGL_JournalRef extends X_GL_JournalRef{

	private static final long serialVersionUID = -5489280577861094898L;

	public MGL_JournalRef(Properties ctx, int GL_JournalRef_ID, String trxName) {
		super(ctx, GL_JournalRef_ID, trxName);
		// TODO Auto-generated constructor stub
	}

}
