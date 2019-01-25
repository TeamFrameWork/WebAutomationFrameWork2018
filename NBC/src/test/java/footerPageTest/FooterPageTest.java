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
    public void goToCorporateInfo(){ clickOnElement(footerPage.corporateInfo);}

    @Test
    public void goToJobs(){clickOnElement(footerPage.jobs);}

    @Test
    public void  goToPrivacy(){clickOnElement(footerPage.privacy);}

    @Test
    public void  goToAccessibility(){clickOnElement(footerPage.accessibility);}

    @Test
    public void  goToViewerPanel(){clickOnElement(footerPage.viewerPanel);}

    @Test
    public void  goToClosedCaptioning(){clickOnElement(footerPage.closedCaptioning);}

    @Test
    public void  goToTechnicalSupport(){clickOnElement(footerPage.technicalSupport);}

    @Test
    public void  goToTerms(){clickOnElement(footerPage.terms);}

    @Test
    public void  goToVideoViewingPolicy(){clickOnElement(footerPage.videoViewingPolicy);}

    @Test
    public void  goToNbcFullEpisode(){clickOnElement(footerPage.nbcFullEpisode);}

    @Test
    public void  goToNbcFAQ(){clickOnElement(footerPage.faq);}

    @Test
    public void  goToNbcCasting(){clickOnElement(footerPage.casting);}

    @Test
    public void  goToParentalGuidlineAndTvRating(){clickOnElement(footerPage.parentalGuidlineAndTvRating);}

    @Test
    public void  goToTicketsAndNbcStudioTour(){clickOnElement(footerPage.ticketsAndNbcStudioTour);}

    @Test
    public void  goToAdChoices(){clickOnElement(footerPage.adchoices);}















}
