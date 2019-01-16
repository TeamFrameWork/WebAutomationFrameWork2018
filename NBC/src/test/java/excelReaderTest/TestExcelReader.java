package excelReaderTest;

import Base.CommonAPI;
import excelReader.ExcelReaderClass;
import homePage.HomePage;
import homePage.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestExcelReader extends CommonAPI {
    HomePage homePage;
    SignUpPage signUpPage;
    @BeforeMethod
    public void initialization (){homePage= PageFactory.initElements(driver,HomePage.class); }
    @BeforeMethod
    public void initialization1(){signUpPage=PageFactory.initElements(driver,SignUpPage.class); }
   @DataProvider
        public Object [][] getData() throws IOException {
       String path="C:\\Users\\sadia\\IdeaProjects\\WebAutomationFrameWork2018\\NBC\\src\\main\\java\\excelReader\\myFile1.xls";
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
        homePage.clickOnsignUpButton();
        signUpPage.setEmailAddressForSignUp(UserEmail);
        signUpPage.setPassword(Password);
        signUpPage.clickOnCheckBox();;
        clickSubmitButton(SignUpPage.signUpButtonInSignUpPage);
    }

}
