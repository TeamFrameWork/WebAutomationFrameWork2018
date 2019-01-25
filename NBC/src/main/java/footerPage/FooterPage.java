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

    @FindBy(how=How.CSS,using = "a[href='/advertise']")
    public static WebElement advertise;

    @FindBy(how=How.CSS,using = "a[href='http://nbcpeacock.rresults.com/?s=1001']")
    public static WebElement viewerPanel;

    @FindBy(how=How.CSS,using = " a[href='/closed-captioning']")
    public static WebElement closedCaptioning;

    @FindBy(how=How.CSS,using = " a[href='/contact/general']")
    public static WebElement technicalSupport;

    @FindBy(how=How.CSS,using = "a[href='/general/pages/terms']")
    public static WebElement terms;

    @FindBy(how=How.CSS,using = "a[href='/general/pages/vppa']")
    public static WebElement videoViewingPolicy;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbc.com/apps']")
    public static WebElement nbcFullEpisode;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbc.com/general/pages/faq']")
    public static WebElement faq;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbc.com/exclusives/pages/casting']")
    public static WebElement casting;

    @FindBy(how=How.CSS,using = "a[href='https://www.nbc.com/global/pages/tv-ratings']")
    public static WebElement parentalGuidlineAndTvRating;

    @FindBy(how=How.CSS,using = " a[href='https://www.nbc.com/tickets/pages/tickets-and-nbc-studio-tour']")
    public static WebElement ticketsAndNbcStudioTour;

    @FindBy(how=How.CSS,using = "span[class='ad-choices-text']")
    public static WebElement adchoices;






















}
