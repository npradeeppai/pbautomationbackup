package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	@FindBy(xpath = "//input[@name='mobileno']")
    private WebElement getStartedPhoneNumberTF;

    @FindBy(xpath = "//span[contains(text(),'Sign Up')]/..")
    private WebElement getStartedSignUpBtn;

    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    private WebElement getStartedLoginBtn;

    @FindBy(xpath = "//input[@name='char1']")
    private WebElement getStartedOtpTF;

    /**
     * Below are the getter and setter methods to access webelements
     * @return webelement
     */

    public GetStartedPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getGetStartedPhoneNumberTF(){
        return getStartedPhoneNumberTF;
    }

    public WebElement getGetStartedSignUpBtn(){
        return getStartedSignUpBtn;
    }

    public WebElement getGetStartedLoginButton(){
        return getStartedLoginBtn;
    }

    public WebElement getGetStartedOtpTF(){
        return getStartedOtpTF;
    }
}
