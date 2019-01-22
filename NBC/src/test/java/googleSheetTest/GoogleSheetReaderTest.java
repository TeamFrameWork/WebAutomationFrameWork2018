package googleSheetTest;

//import com.google.api.services.sheets.v4.Sheets;
//import com.google.api.services.sheets.v4.model.ValueRange;
import googleSheet.GoogleSheetReader;
import homePage.HomePage;
import homePage.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import static databases.ConnectToSqlDB.loadProperties;
import static googleSheet.GoogleSheetReader.getSheetsService;

public class GoogleSheetReaderTest extends GoogleSheetReader {
    HomePage homePage;
    SignUpPage signUpPage;
    @BeforeMethod
    public void initialization (){homePage= PageFactory.initElements(driver,HomePage.class); }
    @BeforeMethod
    public void initialization1(){signUpPage=PageFactory.initElements(driver,SignUpPage.class); }
    @BeforeMethod
    public static Properties loadProperties() throws IOException{
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("C:\\Users\\sadia\\IdeaProjects\\WebAutomationFrameWork2018\\NBC\\src\\test\\resources\\secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }
    @DataProvider(name="googleSheet")
    public Object[]  getTestDataFromGoogleSheet()throws Exception{
        Properties properties =loadProperties();
        String spreadsheetId =properties.getProperty("GOOGLE.spreadsheetID");
        String range=properties.getProperty("GOOGLE.range");
        String[][] data=GoogleSheetReader.getSpreadSheetsToSupplyDataProvider(spreadsheetId,range);
        return data;
    }
    @Test(dataProvider = "googleSheet")
    public void signuUpFromGoogleSheet(String UserEmail,String Password){homePage.clickOnsignUpButton();
        signUpPage.setEmailAddressForSignUp(UserEmail);
        signUpPage.setPassword(Password);
        signUpPage.clickOnCheckBox();;
        clickSubmitButton(SignUpPage.signUpButtonInSignUpPage);
    }

}
