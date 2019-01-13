package FrontPage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodaysDeal extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @tabindex='48']")
    public static WebElement todaysDeal;
    public void clickOnTodaysDeal(){
        todaysDeal.click();}
    @FindBy(how = How.ID,using = "staticImage")
    public static WebElement ShopNow;
    public void hitOnShopNow(){
        ShopNow.click();}
    @FindBy(how = How.CSS,using = "/html[1]/body[1]/div[1]/div[9]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[2] ")
    public static WebElement MedicineSection;
    public void clickOnMedicineSection(){
        MedicineSection.click();}
    @FindBy(how = How.XPATH,using = "//a[@class='nav-a' and @ tabindex='67']")
    public static WebElement Cupons;
    public void clickOnCupon(){
        Cupons.click();}
}
