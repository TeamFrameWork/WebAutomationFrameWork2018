package homePKG;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class PageHeaderAndLogo extends CommonAPI {


    @FindBy(css="span[class=\"Icon Icon--bird\"]")
    public static WebElement twitterLogo;

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderFindYrtwitterAc;

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderHWdoYouWantToRSetYourPW;

    @FindBy(css="div[class=\"PageHeader Edge\"]")
    public static WebElement pgHeaderCheckYourEmail;












    public boolean twitterLogo(){
        //TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean display = twitterLogo.isDisplayed();
        return display;

    }

    public boolean HowDoUwantToRsetYourPassWord(){
        boolean display = pgHeaderHWdoYouWantToRSetYourPW.isDisplayed();
        return display;
    }

    public boolean FindYrtwitterAcExist(){
        boolean display = pgHeaderFindYrtwitterAc.isDisplayed();
        return display;
    }

    public boolean CheckYourEmail(){
        boolean display = pgHeaderCheckYourEmail.isDisplayed();
        return display;
    }

}
