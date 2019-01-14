package com.citibank.pages;
import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    //page factory - OR
    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(id="signInBtn")
    WebElement signInBtn;

    @FindBy(id="rememberUidLabel")
    WebElement rememberId;

@FindBy(xpath = "//img[contains(@class,'brandingLogo ')]")
    WebElement citilogo;

//initializing the page objects:
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    //actions
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public  boolean validateCitiLogo(){
        return citilogo.isDisplayed();
    }

    public HomePage login(){
        username.sendKeys("yh6uh");
        password.sendKeys("890e`890-3");
        signInBtn.click();
        return new HomePage();

    }
}


