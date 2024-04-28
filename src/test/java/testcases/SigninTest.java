package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;

public class SigninTest extends Hook
{
  @Test
  public void signin() 
  {
	  signin.click();
	  newusersignin.click();
	  test.log(LogStatus.INFO, "clicked new user");
  }
}
