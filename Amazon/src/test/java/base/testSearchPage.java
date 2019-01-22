package base;
import Base.CommonAPI;
import FrontPage.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class testSearchPage extends SearchPage {
    @Test
    public void clickOnLogo() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnLogo();
    }
    @Test
    public void clickOnSearch() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnSearch();
    }
    @Test
    public void clickOnOrders() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnOrders();
    }
    @Test
    public void clickOnTryPrime() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnTeyPrime();
    }
    @Test
    public void clickOnGiftCards() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnGiftCards();
    }
    @Test
    public void clickOnLink() throws InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.SingOn();
        Thread.sleep(2000);
    }
    @Test
    public void hitOnTodaysDeal() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnTodaysDeal();
    }
    @Test
    public void hitOnCart() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnCart();
    }
    @Test
    public void clickOnDeliverAddress() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnDeliverAddress();
    }
    @Test
    public void clickOnPicture() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnPicture();
    }
    @Test
    public void hitOnTakeALook() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnTakeALook();
        searchPage.hitOnSingButton();
        searchPage.hitOnPassword();
        searchPage.hitOnEnterButton();
    }
    @Test
    public void hitOnGlassOption() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnGlassOption();
    }
    @Test
    public void clickOnRainbow() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.cliclOnRainbow();
    }
    @Test
    public void clickOnAccountOption() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnAccountAndList();
    }
    @Test
    public void hitOnZacEfronPic() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnZacEfronPic();
    }
    @Test
    public void AmazonStoreFront() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnAmazonStoreFront();
    }
    @Test
    public void echoDotPic() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnEchoDotPic();
    }
    @Test
    public void todaysDeal() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnTodausDealUnder$25();
    }
    @Test
    public void VoiceRemote() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.hitOnVoiceREmote();
    }
    @Test
    public void ControllerCharger() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnControllerCharger();
    }
    @Test
    public void USBCharger() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnUSBCharger();
    }
    @Test
    public void womensLongSwal() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnWomenLongSwal();
    }
    @Test
    public void singOn() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.SingOn();
    }
    @Test
    public void clickOnBathroomRug() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnBathroomRug();
    }
    @Test
    public void clickOnEnergyDrink() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnEnergyDink();
    }
    @Test
    public void clickOnBeefSnack() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.clickOnBeefSnack();
    }
    @Test
    public void clickOnBottles() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
       // searchPage.clickOnBottles();
    }
    @Test
    public void clickOnAddtoCart() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.ClickOnAddToCart();
    }
    @Test
    public void clickOnBreadKit(){
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.ClickOnBreadKit();
    }
    @Test
    public void clickOnKidsCamera(){
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.hitOnKidsCamera();
    }
    @Test
    public void clickOnApparel(){
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.hitOnApparel();
    }
    @Test
    public void clickFitnessTech(){
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.hitOnFitnessTech();
    }
    @Test
    public void clickOnVideo(){
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.clickOnVideo();
    }
}
