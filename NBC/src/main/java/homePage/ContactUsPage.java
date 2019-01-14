package homePage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage {

 @FindBy(how =How.CLASS_NAME,using = "form-element__select")
 public static WebElement options;

 @FindBy(how =How.CSS,using = "option[value='technical_problem']")
 public static WebElement option1;

 @FindBy(how =How.CSS,using = "div[class='form__item form__technical form__select']")
 public static WebElement options1;

 @FindBy(how =How.CSS,using = "option[value='t_live_stream']")
 public static WebElement option11;

 @FindBy(how =How.CSS,using = "input[id='email']")
 public static WebElement email;

 @FindBy(how =How.CSS,using = " input[id='confirm_email']")
 public static WebElement confirmEmail;

 @FindBy(how =How.CSS,using = "textarea[id='technical_description']")
 public static WebElement technicalDescription;

 @FindBy(how =How.CSS,using = "button[class='form-element__button form-element__button--active']")
 public static WebElement submitButton;



 public void setEmail(WebElement element, String email){
  element.sendKeys(email, Keys.ENTER);
 }



}
