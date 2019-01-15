package com.citibank.pages;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Reporter.clear;

public class HomePage extends CommonAPI {
 @FindBy(id="#name")
    public static WebElement username;
 @FindBy(id="#password")
    public static WebElement password;
 @FindBy(id="#signInBtn")
    public static WebElement signIn;
 @FindBy(linkText = "Sign On")
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
    @FindBy(xpath = "/html[1]/body[1]/header[1]/nav[1]/div[1]/a[1]/div[1]")
    public static WebElement brand;

    public void checkbrand(){
        brand.click();
    }
    public  void login(){
        //log.click();
        username.sendKeys("Daru");
        password.sendKeys("abc21");
        signIn.click();
    }
    public void citiGoldAccount(){
        citiGold.click();
    }
    public void findATMOrBranch(){
        findATMOrBranch.click();
    }
    public void creditCards(){
        creditCards.click();
    }
   // public String validateHomePageTitle() { }
    public void banking(){
        bankingLink.click();
    }
    public void clearField(String locator){
         clear();
   }

}


