package com.citibank.pages;
import Base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends CommonAPI {
 @FindBy(xpath="//input[@id='usernameMasked'and @class=' form-control userMask']")
    public static WebElement username;
 @FindBy(id="#password")
    public static WebElement password;
 @FindBy(id="#signInBtn")
    public static WebElement signInButton;
 @FindBy(xpath = "/html/body/div[3]/div[2]/header/div[2]/div/div/ul/li/a")
    public static WebElement log;
 @FindBy(id="#rememberUidLabel")
    public static WebElement rememberMyUserId;
 @FindBy(id="#activate_card")
    public static WebElement activateYourCardLink;
 @FindBy(xpath = "/html/body/main/div[1]/div[3]/section[1]/div/h3/a")
    public static WebElement findBestCreditCardl;
 @FindBy(linkText = "#creditCards > a:nth-child(1)")
    public static WebElement creditCards;
 @FindBy(xpath = "/html/body/header/div[2]/div/div[1]/nav/ul/li[2]/a")
    public static WebElement bankingLink;
 @FindBy(css="#citiGold > a:nth-child(1)")
    public static WebElement citiGold;
 @FindBy(xpath = "/html/body/header/div[1]/div/div/ul/li[1]/a")
    public static WebElement findATMOrBranch;
    public  void login(){
        driver.findElement(By.id("username")).sendKeys("Daru");
        driver.findElement(By.id("password")).sendKeys("abc21");
        driver.findElement(By.id("signInButton")).click();
    }
    public void citiGoldAccount(){
        driver.findElement(By.xpath("citiGold")).click();
    }
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void findATMOrBranch(){
        driver.findElement(By.xpath("findATMOrBranch")).click();
    }
    public void creditCards(){
        driver.findElement(By.linkText("creditCards")).click();
    }
    public String validateHomePageTitle()
    {
        String title = driver.getTitle();
        return title;
    }
    public void banking(){
        driver.findElement(By.xpath("bankingLink;")).click();
    }
    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
   }
   public void navigateBack(){
        driver.navigate().back();
   }
}


