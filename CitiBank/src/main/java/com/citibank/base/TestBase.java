package com.citibank.base;

import Base.CommonAPI;

public class TestBase extends CommonAPI {
   /* public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream((System.getProperty("/Users/saliho/Desktop/MyBranch/WebAutomationFrameWork2018/CitiBank/src/main/java/com/citibank/config/config.properties")));
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        //}
        public static void initializationMethod ()
        {

            String browserName = prop.getProperty("browser");
            if (browserName.equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/Users/saliho/Desktop/MyBranch/WebAutomationFrameWork2018/Driver/chromedriver");
                driver = new ChromeDriver();
            } else if (browserName.equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "/Users/saliho/Desktop/MyBranch/WebAutomationFrameWork2018/Driver/geckodriver");
                driver = new FirefoxDriver();
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
        }
    }*/
}