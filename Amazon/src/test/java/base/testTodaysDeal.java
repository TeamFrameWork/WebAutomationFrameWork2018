package base;

import Base.CommonAPI;
import FrontPage.TodaysDeal;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class testTodaysDeal extends TodaysDeal {
    @Test
    public void todaysDeal(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnTodaysDeal();
    }
    @Test
    public void shopNow(){
    TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
    todaysDeal.hitOnShopNow();}
    @Test
    public void medicineSection(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnMedicineSection();
    }
    @Test
    public void cupons(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnCupon();
    }
    @Test
    public void coupons(){
        TodaysDeal todaysDeal = PageFactory.initElements(driver,TodaysDeal.class);
        todaysDeal.clickOnCupon();
    }


}


