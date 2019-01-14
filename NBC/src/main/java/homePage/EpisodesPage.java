package homePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.LinkedList;

public class EpisodesPage {
@FindBy(how= How.CSS,using = "a[href='/today/video/today-third-hour-jan-11-2019/3857841'] ")
public static WebElement video1;

@FindBy(how= How.CSS,using = "a[href='/today/video/klg-and-hoda-jan-11-2019/3857853'] ")
public static WebElement video2;

@FindBy(how= How.CSS,using = "a[href='/today/video/today-jan-11-2019/3857832']")
public static WebElement video3;

@FindBy(how= How.CSS,using = "a[href='/late-night-with-seth-meyers/video/john-goodman-julia-garner-geoffrey-zakarian/3857361']")
public static WebElement video4;

@FindBy(how= How.CSS,using = "a[ href=/the-tonight-show/video/bryan-cranston-lana-condor-love-jones/3857339']")
public static WebElement video5;

@FindBy(how= How.XPATH,using = "//div[@class='load-button full-width']")
public static WebElement loadButtonFullWidth ;


public static ArrayList<WebElement> list=new ArrayList ();
public ArrayList<WebElement> fillUpTheList( ArrayList<WebElement> list) {
    for (int i = 0; i < 5; i++) {
        list.add(video1);
        list.add(video2);
        list.add(video3);
    }
    return list;

}
public void clickOnTodayVideos(WebElement element ){element.click();}


}
