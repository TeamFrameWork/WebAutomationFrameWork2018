package footerPageTest;

import Base.CommonAPI;
import footerPage.FooterPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterPageTest extends CommonAPI
{
    FooterPage footerPage;
    @BeforeMethod
    public void initialization (){footerPage= PageFactory.initElements(driver,FooterPage.class);
    }
    @Test
    public void goToContactUs(){
        clickOnElement(footerPage.contactUs);
    }

    @Test
    public void goToAccessibility (){ clickOnElement(footerPage.corporateInfo);}

    @Test
    public void goToJobs(){clickOnElement(footerPage.jobs);}

    @Test
    public void  goToPrivacy(){clickOnElement(footerPage.privacy);}


}
