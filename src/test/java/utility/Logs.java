package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
public static Logger log = null;
	
	public static void generateLog(String logname,String obj) throws Exception // define
	{
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream( System.getProperty("user.dir")+"//src//test//resources//"+logname+".properties");
	
		p.load(fis);
		
		p.put("log4j.appender."+obj+".File", System.getProperty("user.dir")+"//src//test//java//logs//"+logname+".log");
	
		PropertyConfigurator.configure(p);
		
		log = Logger.getLogger(logname);
	}

}
