package homeTest;

import Base.CommonAPI;
import homePage.HomePage;
import homePage.SignUpPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static footerPage.FooterPage.contactUs;

public class TestHomePage extends  CommonAPI{
HomePage homePage;
    @BeforeMethod
    public void initialization(){homePage=PageFactory.initElements(driver,HomePage.class);}
    @Test
    public void goToPageShows() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.clickOnShowsPagelink();
    }
    @Test
    public void goToPageEpisodes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.clickOnEpisodesPageLink();
    }
    @Test
    public void goToPageSchedule(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.clickOnSchedulePageLink();
    }
    @Test
    public void goToPageNewAndSports() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage.clickOnnewAndSportsPageLink();
    }
    @Test
    public void goToPageShop() {
        homePage.clickOnShopPageLink();
    }
    @Test
    public void goToPageApps() { homePage.clickOnAppsPageLink();
    }
    @Test
    public void goToPageLive() { homePage.clickOnLivePageLink();
    }
    @Test
    public void goToSearchPage(){
        homePage.clickOnSearchButton();
    }
    @Test
    public void goToSignUpPage(){ homePage.clickOnsignUpButton();
    }

}
