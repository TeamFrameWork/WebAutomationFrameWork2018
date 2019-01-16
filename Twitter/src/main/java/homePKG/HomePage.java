package homePKG;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends LogInPage{

    @FindBy(id = "global-nav-home")
    //@FindBy(xpath="//li[@class=\"home active\"]//a[@class=\"js-nav js-tooltip js-dynamic-tooltip\"]")
    public static WebElement homeIcon;
    @FindBy(xpath= "//li[@id='global-nav-home']//a[@class='js-nav js-tooltip js-dynamic-tooltip']")
    //@FindBy(xpath = "//button[@class=‘btn-link js-refresh-suggestions’]")
    public static WebElement refreshButton;
    @FindBy(linkText = "View all")
    public static WebElement viewAllTab;
    @FindBy(css = "input[class=\"flex-table-input search-query\"]")
    public static WebElement searchInput;
    @FindBy(xpath = "//a[contains(text(),'Sadia sehil') and @class='fullname ProfileNameTruncated-link u-textInheritColor js-nav']")
    public static WebElement selectByName;
    @FindBy(xpath = "//input[@id='search-query']")
    public static WebElement searchtwitter;
    @FindBy(xpath="//span[@class='search-icon js-search-action']")
    public static WebElement searchButton;
    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div[2]/div/ul/li[3]/a")
    public static WebElement peopleTab;
    @FindBy(xpath = "//a[@href='/SharifAlamgir']")
    public static WebElement peopleToChoose;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[1]")
    public static WebElement followButton;
    @FindBy(xpath ="//span[@data-original-title='10:18 PM - 21 Aug 2015']")
    public static WebElement joinedDate;
    @FindBy(xpath="//*[@id=\"page-container\"]/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[5]/div/div/span[2]/button[2]")
    public static WebElement followingButton;
    @FindBy(xpath ="//a[@id=\"user-dropdown-toggle\"]")
    public static WebElement profileAndSettings;
    @FindBy(xpath = "//li[@id=\"signout-button\"]//button")
    public static WebElement logOutButton;




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

    public void searchPeopleByName(){
    searchtwitter.clear();
    searchtwitter.sendKeys("Sharif Alamgir",Keys.ENTER);
        System.out.println("di it hit the enter button?");
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }
    public void clickOnPeopleTab(){
        peopleTab.click();
    }
    public void choosePeopleToFolllow(){
        peopleToChoose.click();
    }
    public void clickOnFollowButton(){
        followButton.click();
    }
    public void readJoinDate(){
        System.out.println(joinedDate.getAttribute("data-original-title"));
    }
    public void readTextFollowingButton(){
        System.out.println(followingButton.getAttribute("linkedText"));
    }
    public void unFollowSharifAlamgir(){
        followingButton.click();
    }
    public void logOut(){
        homeIcon.click();
        profileAndSettings.click();
        logOutButton.click();
    }






    }
