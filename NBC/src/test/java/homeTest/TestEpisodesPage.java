package homeTest;

import Base.CommonAPI;
import homePage.EpisodesPage;
import homePage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestEpisodesPage extends CommonAPI {
    HomePage homePage;
    EpisodesPage episodesPage;

    @BeforeMethod
    public void initialization1(){homePage=PageFactory.initElements(driver,HomePage.class);}
    @BeforeMethod
    public void initialization(){ episodesPage= PageFactory.initElements(driver,EpisodesPage.class); }


    @Test
    public void GoToEpisode1(){
      homePage.clickOnEpisodesPageLink();
      episodesPage.clickOnTodayVideos(EpisodesPage.video1);
      //driver.navigate().back();
        driver.navigate().to("https://www.nbc.com/video");

    }
    @Test
    public void GoToEpisodes() throws InterruptedException {
        ArrayList<WebElement> list1=episodesPage.fillUpTheList(EpisodesPage.list);
        homePage.clickOnEpisodesPageLink();
        for(int i=0;i<5;i++){
            System.out.println(list1.get(i));
            episodesPage.clickOnTodayVideos(list1.get(i));
            Thread.sleep(5000);
            driver.navigate().to("https://www.nbc.com/video");


        }

    }
    @Test
    public void GoToFullwidth(){
        homePage.clickOnEpisodesPageLink();
        episodesPage.clickOnTodayVideos(EpisodesPage.loadButtonFullWidth);
    }

}
