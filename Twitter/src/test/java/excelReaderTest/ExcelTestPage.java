package excelReaderTest;

import Base.CommonAPI;
import excelReader.ExcelReaderClass;
import homePKG.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelTestPage extends CommonAPI {
    HomePage homePage;
    //SignUpPage signUpPage;
    @BeforeMethod
    public void initialization (){homePage= PageFactory.initElements(driver,HomePage.class); }

    @DataProvider
    public Object [][] getData() throws IOException {
        String path="/Users/mohammadsharif/IdeaProjects/WebAutomationFrameWork2018/Twitter/src/main/java/excelReader/File1.xls";
        ExcelReaderClass excelReaderClass= new ExcelReaderClass();
        Object[][] testObject=excelReaderClass.fileReader(path,0);
        for (int i=0;i<testObject.length;i++) {
            for (int j = 0; j < testObject[0].length; j++) {
                System.out.println(testObject[i][j]);
            }
        }
        return testObject;



    }
    @Test(dataProvider = "getData")
    public void signUpUsingDataFromExcel(String UserEmail, String Password)
    {
        homePage.clickOnLoginButton();
        homePage.enterUserName(UserEmail);
        homePage.enterPassword(Password);
        homePage.clickOnLoginButtonAgain();
    }


}
