package dataBaseTest;

import Base.CommonAPI;
import databases.SignUpUsingDB;
import homePage.HomePage;
import homePage.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUpDB extends CommonAPI {
    HomePage homePage;
    SignUpUsingDB signUpUsingDB;
    SignUpPage signUpPage;

    @BeforeMethod
    public void initialisation1(){homePage= PageFactory.initElements(driver,HomePage.class);
    }
    @BeforeMethod
    public void initialization2(){signUpUsingDB=PageFactory.initElements(driver,SignUpUsingDB.class);}


@Test
public void signUpUsignDtatFromBD() throws Exception {
        homePage.clickOnsignUpButton();
        signUpUsingDB.signupUsingExcelData();
        signUpUsingDB.clickOnCheckBox();
        clickSubmitButton(SignUpPage.signInButtonInSignInPage);

}
}
