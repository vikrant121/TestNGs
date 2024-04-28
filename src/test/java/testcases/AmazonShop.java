package testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import core.Hook;

public class AmazonShop 
{
  @Test(dataProvider="getData")
  public void shop(String productname) throws Exception 
  {
	  if(AmazonLogin.login == true)
	  {
		  Hook.searchbox.clear();
		  Hook.searchbox.sendKeys(productname);
		  Hook.test.log(LogStatus.INFO, "searching "+productname);
		  
		  utility.ScreenShot.takeScreenShot(productname);
		  
		  Actions a = new Actions(Hook.driver);
		  a.sendKeys(Keys.ENTER).perform();
		  
		 List<WebElement> search =  Hook.searchresult;
		 Iterator <WebElement> it =  search.iterator();
		   while(it.hasNext())
		   {
			   Hook.test.log(LogStatus.INFO, it.next().getText());
		   }
	  }
	  else
	  {
		  Hook.test.log(LogStatus.INFO, "Not logged in cannot shop");
	  }
  }
  
  @DataProvider
  public Object[][] getData() throws Exception
  {
	  return utility.WBConnection.readWBData("AmazonLogin.xlsx", "Sheet2");
  }
}
