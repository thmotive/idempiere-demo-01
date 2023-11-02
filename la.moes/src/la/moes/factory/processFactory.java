package la.moes.factory;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.osgi.service.component.annotations.Component;

//import th.motive.assetsscan.process.AssetBookingScan;
import la.moes.process.GLJournalMoES;

@Component(
		 property= {"service.ranking:Integer=2"}
		 )

public class processFactory implements IProcessFactory {
	public static final String GL_Journal_MoES = "la.moes.process.GLJournalMoES";
	@Override
	
	public ProcessCall newProcessInstance(String className) {
		// TODO Auto-generated method stub
		if (GL_Journal_MoES.equalsIgnoreCase(className)) {
			return new GLJournalMoES();
		}/*if (className.equalsIgnoreCase("GLJournalMoES"))
			return new GLJournalMoES();*/
		
		return null;
	}

}
