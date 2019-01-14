package homePage;

import Base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How ;

import java.util.Base64;

public class HomePage {
    //NBC PAGES
    @FindBy(how=How.XPATH, using ="//li [@class='navigation__item navigation__item--shows navigation__item--group']")
    public static WebElement showsPage;

    @FindBy(how=How.XPATH,using = "//a[@href='/video']")
    public static WebElement episodesPage;

    @FindBy(how=How.XPATH,using = "//a[@href='/schedule']")
    public static WebElement schedulePage;

    @FindBy(how=How.CSS,using = "li[class='navigation__item navigation__item--group']")
    public static WebElement newAndSportPage;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbcstore.com/?cid=nbc_global_nav_shop']")
    public  static WebElement shopPage;

    @FindBy(how = How.CSS,using = "a[href='/apps']")
    public static WebElement appsPage;

    @FindBy(how = How.CSS,using = "a[href='/live']")
    public static WebElement livePage;

    @FindBy(how = How.CSS,using = "li[class='navigation__item navigation__item--search']")
    public static WebElement searchButton;

    @FindBy(how=How.CSS,using = "a[href='/sign-up']")
    public static  WebElement signUpButton;

    @FindBy(how=How.CSS,using = " a[href='/contact/general']")
    public static  WebElement contactUs;


    public void  clickOnShowsPagelink(){ showsPage.click();}
    public void  clickOnEpisodesPageLink(){ episodesPage.click(); }
    public void  clickOnSchedulePageLink(){schedulePage.click(); }
    public void  clickOnnewAndSportsPageLink(){newAndSportPage.click();}
    public void  clickOnShopPageLink(){shopPage.click();}
    public void  clickOnAppsPageLink(){appsPage.click();}
    public void  clickOnLivePageLink(){ livePage.click();}
    public void  clickOnSearchButton(){ searchButton.click(); }
    public void  clickOnsignUpButton(){ signUpButton.click(); }
    // signUp



//    public  void  searchElement(){
//        SearchElement.sendKeys("book", Keys.ENTER);
//    }

}


