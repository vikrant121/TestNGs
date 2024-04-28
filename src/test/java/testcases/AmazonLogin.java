package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;

public class AmazonLogin extends Hook
{
	public static boolean login = false;
  @Test
  public void login() throws Exception 
  {
	  signin.click();
	  uid.sendKeys("paragguide@yahoo.co.in");
	  ctnbtn.click();
	     try {
	 test.log(LogStatus.ERROR, err1.getText());
	 Assert.fail("userid is wrong..");
	     }
	     catch(Exception e)
	     {
	    	 test.log(LogStatus.INFO, "userid is valid");
	    	 
	    	 
	    	 
	    	 pwd.sendKeys("RMinfotech");
	    	 submit.click();
	    	     try {
	    	 test.log(LogStatus.ERROR, err2.getText());
	    	 Assert.fail("password wrong");
	    	     }
	    	     catch(Exception ee)
	    	     {
	    	    	 test.log(LogStatus.INFO, "password is valid");
	    	    	 login = true;
	    	    	 
	    	    	 utility.ScreenShot.takeScreenShot("LoginSucsess");
	    	     }
	    	 
	     }
	  
  }
      /*
  @Test(dependsOnMethods = "login")
  public void shop()
  {
	  
  }
     */
}
