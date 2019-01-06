package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        System.setProperty("webdriver.chrome.driver","/Users/saliho/Desktop/MyBranch/WebAutomationFrameWork2018/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }
@AfterMethod
    public void cleanUp()
{
   driver.close();
}
public void typeOnCssButton(String locator ){
        driver.findElement(By.cssSelector(locator)).click();
}
public void typeOnCss(String locator ,String value ){
 driver.findElement(By.cssSelector(locator)).sendKeys(value);
}
public void typeOnID(String locator ,String value ){
        driver.findElement(By.id(locator)).sendKeys(locator);
}
public void typeOnElement (){

}
public void clickOnButon(){

}
public void navigateBack(){
        driver.navigate().back();
}
}
