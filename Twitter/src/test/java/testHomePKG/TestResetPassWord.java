package testHomePKG;

import Base.CommonAPI;
import homePKG.ResetPassWord;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestResetPassWord extends CommonAPI {
    ResetPassWord reSetPassWord;
    @BeforeMethod
    public void initialization (){reSetPassWord= PageFactory.initElements(driver, ResetPassWord.class);
    }
    @Test
    public void goToLogin(){
        reSetPassWord.clickOnLoginButton();
        reSetPassWord.enterUserName();
        reSetPassWord.enterPassWord();
        reSetPassWord.clickOnLoginButtonAgain();
        reSetPassWord.click2CloseMessageBox();
        reSetPassWord.clickForgotPassWordLink();
        reSetPassWord.pgHeaderFindYrtwitterAcExist();
        reSetPassWord.clearInputField();
        reSetPassWord.enterEmailAddress();
        reSetPassWord.clickOnSearchToFindTheAccount();
        reSetPassWord.pgHeaderHowDoUwantToRsetYourPassWord();
        reSetPassWord.radioBtnSelectedAsText();
        reSetPassWord.radiobtnSelectedAsEmail();
        reSetPassWord.clicContinueOnButton();
        reSetPassWord.pgHeaderCheckYourEmail();
        reSetPassWord.contactSupport();
    }
    }
