package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShowsPage {

     @FindBy(how=How.CSS,using = "a[href='/americas-got-talent'] ")
     public static WebElement  americasGotTalent ;

     @FindBy(how=How.CSS,using = "a[href='/the-blacklist']")
     public static WebElement theBlackList;

     @FindBy(how=How.CSS,using="a[href='a[href='/blindspot'] '] ")
     public static WebElement blindSpot;

    @FindBy(how=How.CSS,using="a[href='/brooklyn-nine-nine'] ")
    public static WebElement brooklynNineNine;

    @FindBy(how=How.CSS,using="a[href='/chicago-fire']  ")
    public static WebElement chicagoFire;

    @FindBy(how=How.CSS,using="a[href='/chicago-med']  ")
    public static WebElement chicagoMed;

    @FindBy(how=How.CSS,using="a[href='/chicago-pd'] ")
    public static WebElement chicagoPd;

    @FindBy(how=How.CSS,using=" a[href='/ellens-game-of-games']")
    public static WebElement ellensGameOfGames;

    @FindBy(how=How.CSS,using="a[href='/the-good-place']")
    public static WebElement theGoodPlace;

    @FindBy(how=How.CSS,using="a[href='/dateline']")
    public static WebElement dateline;

    @FindBy(how=How.CSS,using="a[href='/shows/current']")
    public static WebElement allShows;
    //share in social networks
    @FindBy(how=How.CSS,using="a[href='https://facebook.com/nbc']")
    public static WebElement shareInFacebook;

    @FindBy(how=How.CSS,using="a[href='https://twitter.com/nbc'] ")
    public static WebElement shareInTwitter;

    @FindBy(how=How.CSS,using="a[href='https://nbctv.tumblr.com']")
    public static WebElement shareInTumblr;

    @FindBy(how=How.CSS,using="a[href='https://pinterest.com/nbctv']")
    public static WebElement shareInPinterest;

    @FindBy(how=How.CSS,using="a[href='https://plus.google.com/110741260330832413403/posts']")
    public static WebElement shareInGoogle;

    @FindBy(how=How.CSS,using="a[href='https://youtube.com/nbc']")
    public static WebElement shareInYoutube;


    public void clickOnListPagesLink(WebElement element){element.click();
    }


}
