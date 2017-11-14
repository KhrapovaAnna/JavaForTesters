package anna.cources.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {
        super (wd);
    }
    public void login(String login, String Password) {
        wd.get("http://localhost/addressbook/");
        type (By.name("user"), login);
        type (By.name("pass"), Password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

}
