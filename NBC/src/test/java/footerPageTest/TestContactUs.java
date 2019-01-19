package footerPageTest;

import Base.CommonAPI;
import footerPage.ContactUsPage;
import footerPage.FooterPage;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static footerPage.FooterPage.contactUs;

public class TestContactUs extends CommonAPI {
    ContactUsPage contactUsPage;

    FooterPage footerPage;
    @BeforeMethod
    public void initialization(){footerPage= PageFactory.initElements(driver,FooterPage.class);
    }
    @BeforeMethod
    public void initialization1(){contactUsPage= PageFactory.initElements(driver,ContactUsPage.class);
    }
    @Test
    public void contactUsPage(){
        clickOnElement(contactUs);
        clickOnElement(ContactUsPage.options);
        clickOnElement((ContactUsPage.option1));
        clickOnElement(ContactUsPage.options1);
        clickOnElement(ContactUsPage.option11);
        clickOnElement(ContactUsPage.email);
        contactUsPage.setEmail(ContactUsPage.email,"sadiasehil89@gmail.com");
        contactUsPage.setEmail(ContactUsPage.confirmEmail, "sadiasehil89@gmail.com");
        clickOnElement(ContactUsPage.technicalDescription);
        contactUsPage.setEmail(ContactUsPage.technicalDescription,"I am having truble with ........");
        clickSubmitButton(ContactUsPage.submitButton);
    }
}
