package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver =null;

    @Parameters({"url"})

    @BeforeMethod
    public void setUp(@Optional("https://twitter.com") String url ){
        System.setProperty("webdriver.chrome.driver","/Users/mohammadsharif/IdeaProjects/WebAutomationFrameWork2018/Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    //By sharif-1
    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);

                }//third catch
            }//second catch
        }//first catch
    }//main

    //By sharif-2

    public void clickOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).click();
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).click();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).click();

                }//third catch
            }//second catch
        }//first catch
    }//main

    //--Sharif



    @AfterMethod
    public void cleanUp(){
        //driver.close();
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
