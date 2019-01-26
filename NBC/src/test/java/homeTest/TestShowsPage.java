package homeTest;

import Base.CommonAPI;
import homePage.HomePage;
import homePage.ShowsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static homePage.ShowsPage.deadline;

public class TestShowsPage extends CommonAPI {
    HomePage homePage;
    ShowsPage showsPage;
    @BeforeMethod
    public void initialization1(){ homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @BeforeMethod
    public void initialization (){ showsPage = PageFactory.initElements(driver,ShowsPage.class);
    }

    @Test
    public void goToAmericasGotTalentPage(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.americasGotTalent);
        navigateBack();

    }
    @Test
    public void goToTheBlackList(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.theBlackList);
        navigateBack();
    }
    @Test
    public void goToBlindSpot(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.blindSpot);
    }
    @Test
    public void goToBrooklynNineNine(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.brooklynNineNine);
    }
    @Test
    public void goToChicagoFire(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.chicagoFire);
        navigateBack();
    }
    @Test
    public void goToChicagoMed(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.chicagoMed);
        navigateBack();
    }
    @Test
    public void goToChicagoPd(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.chicagoPd);
        navigateBack();
    }
    @Test
    public void goToEllenGameOfGame(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.ellensGameOfGames);
        navigateBack();
    }
    @Test
    public void goToTheGoodPlace(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.theGoodPlace);
        navigateBack();
    }
    @Test
    public void goToAllShows(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.allShows);
        navigateBack();
    }
    @Test
    public void goToDateLine(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.dateline);
    }
    @Test
    public void shareOnFacebook(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInFacebook);
    }
    @Test
    public void shareOnTwitter(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInTwitter);
    }
    @Test
    public void shareOnTumblr(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInTumblr);
    }
    @Test
    public void shareOnPinterest(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInPinterest);
        navigateBack();
    }
    @Test
    public void shareOnGoogle(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInGoogle);
    }
    @Test
    public void shareOnYoutube(){
        homePage.clickOnShowsPagelink();
        showsPage.clickOnListPagesLink(ShowsPage.shareInYoutube);
    }
    //








}
