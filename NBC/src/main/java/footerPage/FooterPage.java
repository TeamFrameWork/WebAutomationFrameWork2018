package footerPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterPage {
    @FindBy(how= How.CSS,using = " a[href='/contact/general']")
    public static WebElement contactUs;

    @FindBy(how=How.CSS,using="a[href='/general/pages/accessibility']")
    public static WebElement accessibility;

    @FindBy(how=How.CSS,using=" a[href='http://www.nbcuni.com/']")
    public static WebElement corporateInfo;

    @FindBy(how=How.CSS,using = "a[href='http://www.nbcunicareers.com/'] ")
    public static WebElement jobs;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbcuniversal.com/privacy']")
    public static WebElement privacy;



}
