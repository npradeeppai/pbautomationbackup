package testScripts;

import org.testng.annotations.Test;
import generic.BaseClass;
import generic.WebDriverUtils;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class Login extends BaseClass{
	@Test
    public void login(){
		HomePage h1=new HomePage(driver);
        LoginPage l1=new LoginPage(driver);
        WelcomePage w1=new WelcomePage(driver);
        WebDriverUtils wu=new WebDriverUtils();
		driver.get("https://qa.pensionbox.in");
        h1.getLoginBtn().click();
        l1.getLogInPhoneNumberTF().sendKeys("9844267177");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
        
        if(wu.isItVisible(w1.getSkipForNowBtn())) {
        	w1.getSkipForNowBtn().click();        	
        }
        
        if(wu.isItVisible(w1.getNotNowBtn())) {
        	w1.getNotNowBtn().click();
        }
    }
}
