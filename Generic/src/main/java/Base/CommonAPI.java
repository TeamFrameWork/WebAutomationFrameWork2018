package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver =null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sadia\\IdeaProjects\\WebAutomationFrameWork2018\\Driver\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
@AfterMethod
    public void cleanUp()
{
   driver.close();
}
}
