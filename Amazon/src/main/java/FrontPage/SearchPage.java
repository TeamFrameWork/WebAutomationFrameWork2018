package FrontPage;
import Base.CommonAPI;
import com.google.errorprone.annotations.FormatMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class SearchPage extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//input[@id='twotabsearchtextbox']" )
      public static WebElement search;
      public void clickOnSearch(){
        search.click();
        search.sendKeys("book", Keys.ENTER);}
    @FindBy(how = How.CSS,using = "span[class='nav-sprite nav-logo-base']")
      public static WebElement logo;
      public void clickOnLogo(){
        logo.click();
    }
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a nav-a-2 nav-single-row-link' and @id='nav-orders']//span[@class='nav-line-2']" )
      public static WebElement orders;
    public void clickOnOrders() {
        orders.click();
    }
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a nav-a-2 nav-single-row-link'and@id='nav-link-prime']//span[@class='nav-line-2']")
      public static WebElement tryPrime;
      public void clickOnTeyPrime(){
        tryPrime.click();
    }
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @tabindex='49']")
      public static WebElement giftCards;
      public void clickOnGiftCards(){
        giftCards.click();
    }
    @FindBy(how = How.ID,using = "nav-your-amazon")
      public static WebElement Link;
    @FindBy(how = How.ID,using = "ap_email")
      public static WebElement email;
    @FindBy(how = How.ID,using = "ap_password")
      public static WebElement password;
    @FindBy(how = How.ID,using = "signInSubmit")
      public static WebElement hitOnSingIn;
      public void SingOn(){
        Link.click();
        email.sendKeys("Farhana");
        password.sendKeys("1234");
        hitOnSingIn.click();}
        @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @tabindex='48']")
      public static WebElement TodaysDeal;
      public void hitOnTodaysDeal(){
        TodaysDeal.click();
    }
    @FindBy(how = How.ID,using = "nav-cart")
      public static WebElement Cart;
      public void hitOnCart(){
        Cart.click();
    }
    @FindBy(how = How.ID,using = "glow-ingress-line2")
      public static WebElement deliverAddress;
      public void hitOnDeliverAddress(){
        deliverAddress.click();
    }
    @FindBy(how = How.CLASS_NAME,using = "a-link-normal aok-inline-block")
      public static WebElement Picture;
      public void clickOnPicture(){
        Picture.click();
    }
    @FindBy(how = How.CSS,using = "")
      public static WebElement TakeALook;
    @FindBy(how = How.ID,using = "ap_email")
      public static WebElement SingOnOption;
    @FindBy(how = How.ID,using = "ap_password")
      public static WebElement setPassword;
    @FindBy(how = How.CLASS_NAME,using = "a-button-input")
      public static WebElement clickOnSingOn;
      public void hitOnTakeALook(){
        TakeALook.click();
        SingOnOption.sendKeys("farhana");
        setPassword.sendKeys("2345");
        clickOnSingOn.click();}
        @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @tabindex='5']")
        public static WebElement GlassOption;
      public void hitOnGlassOption(){
        GlassOption.click();}
        @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @ tabindex='5']")
    public static WebElement RainbowPic;
    public void cliclOnRainbow(){
        RainbowPic.click();}
        @FindBy(how = How.CLASS_NAME,using = "//a[@id='nav-link-accountList']//span[@class='nav-line-2']")
    public static WebElement AccountList;
    public void clickOnAccountAndList(){
       AccountList.click();}
     @FindBy(how = How.XPATH,using = "//img[@alt='Zac Efron Store']")
    public static WebElement ZacEfronPic;
    public void hitOnZacEfronPic(){
        ZacEfronPic.click();
    }
    @FindBy(how = How.XPATH,using = "//img[@alt='New Year, New You Store']")
    public static WebElement AmazonStoreFront;
    public void clickOnAmazonStoreFront(){
        AmazonStoreFront.click();
    }
    @FindBy(how = How.XPATH,using = "//img[@alt='Image of an Echo Dot.']")
    public static WebElement EchoDotPic;
    public void hitOnEchoDotPic(){
        EchoDotPic.click();}
    @FindBy(how = How.XPATH,using = "//span[contains(text(),\"Today's deals under $25\")]")
    public static WebElement todaysDeal;
    public void clickOnTodausDealUnder$25(){
        todaysDeal.click();}
    @FindBy(how = How.XPATH,using = "//img[@title='Save $10 on the Echo Voice Remote']")
    public static WebElement VoiceRemote;
    public void hitOnVoiceREmote(){
        VoiceRemote.click();}
    @FindBy(how = How.XPATH,using = "//img[@title='PS4 Controller Charger, Y Team Playstation 4 / PS4 / PS4 Pro / PS4 Slim Controller Charger Charging Docking Station Stand.Dual USB Fast Charging Station & LED Indicator for Sony PS4 Controller--Black']")
    public static WebElement controllerCharger;
    public void clickOnControllerCharger(){
        controllerCharger.click();}
    @FindBy(how = How.XPATH,using = "//img[@title='Amazon 9W USB Charger 25% Off']")
    public static WebElement USBCharger;
    public void clickOnUSBCharger(){
        USBCharger.click();}
    @FindBy(how = How.CSS,using = "//img[@title='Wander Agio Women's Fashion Long Shawl Big Grid Winter Warm Lattice Large Scarf']")
    public static WebElement womensLongSwal;
    public void clickOnWomenLongSwal(){
        womensLongSwal.click();}
    @FindBy(how = How.XPATH,using = "//img[@title='Genteele Memory Foam Bath Mat Non Slip Absorbent Super Cozy Velvet Bathroom Rug Carpet']")
    public static WebElement BathroomRug;
    public void clickOnBathroomRug(){
        BathroomRug.click();}
    @FindBy(how = How.XPATH,using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[1]//span[1]//a[1]//img[1]")
    public static WebElement EnergyDrink;
    public void clickOnEnergyDink(){
        EnergyDrink.click();}
    @FindBy(how = How.XPATH,using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[2]//span[1]//a[1]//img[1]")
    public static WebElement BeefSnack;
    public void clickOnBeefSnack(){
        BeefSnack.click();}
    @FindBy(how = How.XPATH,using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[3]//span[1]//a[1]//img[1]")
    public static WebElement Bottles;
    @FindBy(how = How.XPATH,using = "//input[@id='add-to-cart-button']")
    public static WebElement AddToCart;
    public void ClickOnAddToCart(){
        Bottles.click();
        AddToCart.click();}
    @FindBy(how = How.XPATH,using = "//img[@alt='LoafNest: Incredibly Easy Artisan Bread Kit. Cast Iron Dutch Oven and Non-Stick Perforated Silicone Liner [Blue Gradient].']")
    public static WebElement BreadKit;
    public void ClickOnBreadKit(){
        BreadKit.click();}
    @FindBy(how = How.XPATH,using = "//div[@id='desktop-2']//ul[@class='a-unordered-list a-nostyle a-horizontal feed-carousel-shelf']//li[5]//span[1]//a[1]//img[1]")
    public static WebElement KidsCamera;
    public void hitOnKidsCamera(){
        KidsCamera.click();}
    @FindBy(how = How.XPATH,using = "//img[@alt='Affordable apparel']")
    public static WebElement Apparel;
    public void hitOnApparel(){
        Apparel.click();}
    @FindBy(how = How.XPATH,using = "//img[@alt='Get moving with fitness tech']")
    public static WebElement FitnessTech;
    public void hitOnFitnessTech(){
        FitnessTech.click();}
    @FindBy(how = How.XPATH,using = "//div[@class='amznlv-react-player-control-activate videojs-control-activate']")
    public static WebElement Video;
    public void clickOnVideo(){
        Video.click();}

}
