package citiSearch;

import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.management.ConstructorParameters;


public class CitiMainPage extends CommonAPI {

   @Test
   public void typeOnCss(String locator, String value){
      driver.findElement(By.cssSelector(locator)).sendKeys(value);
   }
   @Test
   public void typeOnId(String locator, String value){
      driver.findElement(By.id(locator)).sendKeys(value);
   }
   @Test
   public void  typeOnElement(String locator, String value){
      try {

         driver.findElement(By.cssSelector(locator)).sendKeys(value);
      }catch (Exception e1){
         try {
            driver.findElement(By.name(locator)).sendKeys(value);
         }catch (Exception e2){
            try {
               driver.findElement(By.xpath(locator)).sendKeys(value);
            }catch (Exception e3){driver.findElement(By.id(locator)).sendKeys();}
         }
      }
   }

   public void clearField(String locator){
      driver.findElement(By.id(locator)).clear();
   }

   public void navigateBack(){
      driver.navigate().back();
   }
}


