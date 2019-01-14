package databases;

import homePage.SignUpPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class SignUpUsingDB extends SignUpPage
{
String email1="sadiasehil89@gmail.com";
String email2="ssinf_1989@live.fr";
String password1 ="sadia123";
ArrayList<String> myData =new ArrayList();
public ArrayList<String> dataBaseData()
{
    myData.add(email1);
    myData.add(password1);
    return myData;

}

public void  createDataBaseAndTble() throws Exception {
    dataBaseData();
 ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
 ConnectToSqlDB.connectToSqlDatabase();
 connectToSqlDB.insertStringDataFromArrayListToSqlTable(myData,"signUpTable","DataSignUp");
 List<String> emails =connectToSqlDB.readDataBase("signUpTable","DataSignUp");
 emailAddressBox.sendKeys(emails.get(0), Keys.ENTER);
 passwordBox.sendKeys(emails.get(1),Keys.ENTER);
}


}
