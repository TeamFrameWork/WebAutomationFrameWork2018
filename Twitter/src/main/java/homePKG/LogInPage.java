package homePKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class LogInPage extends ResetPassWord {
    @FindBy(xpath = " //a[@data-original-title='Profile and settings']")
    public static WebElement profileNsettingsIcon;
    @FindBy(id = "global-nav-home")
    //@FindBy(xpath="//li[@class=\"home active\"]//a[@class=\"js-nav js-tooltip js-dynamic-tooltip\"]")
    public static WebElement homeIcon;
    @FindBy(css= "button[class='btn-link js-refresh-suggestions']")
    //@FindBy(xpath = "//button[@class=‘btn-link js-refresh-suggestions’]")
    public static WebElement refreshButton;
    @FindBy(linkText = "View all")
    public static WebElement viewAllTab;
    @FindBy(css = "input[class=\"flex-table-input search-query\"]")
    public static WebElement searchInput;
    @FindBy(xpath = "//a[contains(text(),'Sadia sehil') and @class='fullname ProfileNameTruncated-link u-textInheritColor js-nav']")
    public static WebElement selectByName;


    public void clickOnProfileNsettingsIcon(){
        profileNsettingsIcon.click();
        System.out.println("Logout Button Clicked to Logout from the Account");
    }
    public void clickOnHOmeIcon(){
        System.out.println("Home Icon is clicked");
        homeIcon.click();
    }
    public void clickOnRefresh(){
        System.out.println("refresh button clicked");
        refreshButton.click();
    }
    public void clickOnViewAllTab(){
        System.out.println("view all tab is clicked");
        viewAllTab.click();
    }
    public void searchWhom2Follow(){
        searchInput.clear();
        searchInput.sendKeys("sadia sehil", Keys.ENTER);
    }
    public void selectWhom2Follow(){
        selectByName.click();
    }

    @Override
    public void enterUserName(){
    System.out.println("UserName entered ");
    userNameField.clear();
    userNameField.sendKeys("palash.us@live.com");
    }
    @Override
    public void enterPassWord(){
    System.out.println("PassWord Entered");
    passWordFiled.clear();
    passWordFiled.sendKeys("!tweetMe");
    }
    }




