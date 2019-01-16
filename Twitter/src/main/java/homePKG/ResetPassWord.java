package homePKG;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.BeforeMethod;

import java.net.PortUnreachableException;

public class ResetPassWord {
    @FindBy(linkText = "Log in")
    public static WebElement loginButton1;
    @FindBy(css="Input[class='js-username-field email-input js-initial-focus']")
    public static WebElement userNameField;
    @FindBy(css="input[class='js-password-field']")
    public static WebElement passWordFiled;
    @FindBy(xpath="//label[@class=\"t1-label remember\"]//input[@name=\"remember_me\"]")
    public static WebElement click2UnCheckRememberMeButton;
    @FindBy(css = "button[class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")
    public static WebElement loginButton2;
    @FindBy(css = "a[class='Icon Icon--close Icon--medium dismiss']")
    public static WebElement closeMessageBox;
    @FindBy(xpath= "//label[@class=\"t1-label remember\"]//a[@href=\"/account/begin_password_reset\" ]")
    public static WebElement forgorPasswrdLink;
    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderFindYrtwitterAc;
    @FindBy(css = "input[name='account_identifier']")
    public static WebElement provideUserEmail;
    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement searchBuuton;
    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderHWdoYouWantToRSetYourPW;
    @FindBy(css= "input[class='Button EdgeButton--primary EdgeButton']")
    public static WebElement clickContinueButton;
    @FindBy(linkText= "I didn't receive the email")
    public static WebElement checkYourEmailMessagePageDisplayed;
    @FindBy(css= "a[href=\"https://support.twitter.com/forms/signin?ref=password_reset\" ]")
    public static WebElement contactSupportLink;
    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement PageHeaderRsetPwIsExist;
    @FindBy(css="input[value=\"1083494843307999232\"]")
    public static WebElement radBtnText2rsetPW;
    @FindBy(css="input[value=\"-1\"]")
    public static WebElement radBtnEmail2rsetPW;
    @FindBy(css="input[class=\"Button EdgeButton--primary EdgeButton\"]")
    public static WebElement continue2rsPW;
    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderChkYrEmalisExist;

    public void clickOnLoginButton(){
        System.out.println("clicked in logIn Button to continue");
        loginButton1.click();
    }
    public void UnCheckRememberMeButton(){
        System.out.println("Remember me button is Unchecked");
        click2UnCheckRememberMeButton.click();
    }
    public void enterUserName(){
        System.out.println("wrong user credential passed");
        userNameField.sendKeys("palash");
    }
    public void enterPassWord(){
        System.out.println("wrong passwd entered");
        passWordFiled.sendKeys("900090");
    }
    public void clickOnLoginButtonAgain(){
        System.out.println("logIn Button clicked");
        loginButton2.click();
    }
    public void click2CloseMessageBox(){
        System.out.println("x button clicked to close the message box");
        closeMessageBox.click();
    }
    public void clickForgotPassWordLink(){
        System.out.println("forgorPasswrdLink clicked ");
        forgorPasswrdLink.click();
    }
    public void pgHeaderFindYrtwitterAcExist(){

        System.out.println("Find Your Twitter Accout Page Header Appears?:"+pgHeaderFindYrtwitterAc.isDisplayed());
    }
    public void clearInputField(){
        provideUserEmail.clear();
    }

    public void enterEmailAddress(){
        System.out.println("user's ac associated email is entered");
        provideUserEmail.sendKeys("palash.us@live.com");
    }
    public void clickOnSearchToFindTheAccount(){
        System.out.println("user clicked on the search Buuton to Find the Account");
        searchBuuton.click();
    }
    public void pgHeaderHowDoUwantToRsetYourPassWord(){
        System.out.println("How do yu want to reset your pass word is dispaled?"+pgHeaderHWdoYouWantToRSetYourPW.isDisplayed());
    }
    public void radioBtnSelectedAsText(){
        System.out.println("radio Button text is selected");
        radBtnText2rsetPW.click();
    }
    public void radiobtnSelectedAsEmail(){
        System.out.println(" radio button Email is selected");
        radBtnEmail2rsetPW.click();
    }
    public void clicContinueOnButton(){
        System.out.println("clicked on continue button to het the link:");
        clickContinueButton.click();
    }
    public void pgHeaderCheckYourEmail(){
        System.out.println("page Header check your Email is Displayed? "+pgHeaderChkYrEmalisExist.isDisplayed());
    }
    public void contactSupport(){
        contactSupportLink.isDisplayed();
        //System.out.println("contact support link is clicked");
        //contactSupportLink.click();
    }
    }
