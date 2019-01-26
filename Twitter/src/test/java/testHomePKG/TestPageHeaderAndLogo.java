package testHomePKG;

import Base.CommonAPI;
import homePKG.HomePage;
import homePKG.PageHeaderAndLogo;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPageHeaderAndLogo extends PageHeaderAndLogo {

    public PageHeaderAndLogo pgHeaderLogo;

    @BeforeMethod
    public void initialize() {pgHeaderLogo = PageFactory.initElements(driver, PageHeaderAndLogo.class);}

    @Test
    public void isTwitterLogoDisplayed(){
        boolean display = pgHeaderLogo.twitterLogo();
        Assert.assertTrue (display);
    }
    @Test
    public void isHowDoUwantToRsetYourPassWord(){
        boolean display = pgHeaderLogo.HowDoUwantToRsetYourPassWord();
        Assert.assertTrue(display);
    }
    @Test
    public void isFindYrtwitterAcExist(){
        boolean display = pgHeaderLogo.FindYrtwitterAcExist();
        Assert.assertTrue(display);
    }
    @Test
    public void isCheckYourEmail(){
        boolean display = pgHeaderLogo.CheckYourEmail();
        Assert.assertTrue(display);
    }

    /*@Test
    public void isFooterLogoDisplayed(){
        boolean logo = footerPage.isFooterLogoDisplayd();
        Assert.assertEquals(logo,true);
    }*/

}
