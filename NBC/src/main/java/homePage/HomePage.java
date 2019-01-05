package homePage;

import Base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

public void searchPage (){

    typeOnCssButton("#app > div > header > div > div > nav > div > ul > li.navigation__item.navigation__item--search > button");
}


}
