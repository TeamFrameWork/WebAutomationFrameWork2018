package homePage;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Base64;
import java.util.Set;

public class SignUpPage extends CommonAPI {
    //SignUp
    @FindBy(how= How.CSS,using ="input[id='signup-form__email']")
    public static WebElement emailAddressBox;

    @FindBy(how =How.CSS,using = "input[name='password'] ")
    public static  WebElement passwordBox;

    @FindBy(how = How.CLASS_NAME,using = "signup-form__terms-checkbox")
    public static WebElement checkBox;

    @FindBy(how = How.CLASS_NAME,using = "signup-form__submit")
    public static WebElement signUpButtonInSignUpPage;

    @FindBy(how = How.CSS,using = "button[class='button button--facebook']")
    public static WebElement signUpWithFacebookButton;

    @FindBy(how = How.CSS,using = "a[href='/sign-in']")
    public  static WebElement signInLink;

    @FindBy(how = How.CSS,using ="input[class='signin-form__email']")
    public static  WebElement emailAddressForSign;

    @FindBy (how = How.CSS,using = "input[name='password'] ")
    public static  WebElement passwordBoxForSignIn;

    @FindBy(how = How.CLASS_NAME,using = "signin-form__submit")
    public static WebElement signInButtonInSignInPage;



    public  void setEmailAddressForSignUp( String emailAddress){
        emailAddressBox.click();
        emailAddressBox.sendKeys(emailAddress,Keys.ENTER);
    }

    public void setPassword(String password){
        //String encryptedPasssword= encryptPassword(password);
        passwordBox.click();
        passwordBox.sendKeys(encryptPassword (password),Keys.ENTER);
    }

    public void clickOnCheckBox(){
        checkBox.click();
    }

    public void clickOnSignUpFacebook()
    {
        signUpWithFacebookButton.click();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID is : " + parentWindow);
        Set<String> allWindow = driver.getWindowHandles();
        int count = allWindow.size();
        System.out.println("Total Window : " + count);

        for(String child:allWindow)
        {
            if (!parentWindow.equalsIgnoreCase(child))
            {
                driver.switchTo().window(child);
            }
        }
    }
    public void goToSignInPage(){
        signInLink.click();
    }

    public  void setEmailAddressForSignIn( String emailAddress)
    {
        emailAddressForSign.click();
        emailAddressForSign.sendKeys(emailAddress,Keys.ENTER);
    }
    public void setPasswordForSignIn(String password1){
        //encryptPassword(password);
        passwordBoxForSignIn.click();
        passwordBoxForSignIn.sendKeys(password1,Keys.ENTER);
    }


}
