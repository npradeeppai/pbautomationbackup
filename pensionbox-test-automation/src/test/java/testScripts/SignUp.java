package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.WebDriverUtils;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.WelcomePage;

public class SignUp extends BaseClass{
	@Test
    public void signUp(){
        HomePage h=new HomePage(driver);
        GetStartedPage gsp=new GetStartedPage(driver);
        WelcomePage w1=new WelcomePage(driver);
        WebDriverUtils wu=new WebDriverUtils();
        driver.get("https://qa.pensionbox.in/");
        h.getGetStartedBtn().click();
        gsp.getGetStartedPhoneNumberTF().sendKeys("9844267177");
        gsp.getGetStartedSignUpBtn().click();
        gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
        
        if(wu.isItVisible(w1.getSkipForNowBtn())) {
        	w1.getSkipForNowBtn().click();        	
        }
        
        if(wu.isItVisible(w1.getNotNowBtn())) {
        	w1.getNotNowBtn().click();
        }
    }
}

