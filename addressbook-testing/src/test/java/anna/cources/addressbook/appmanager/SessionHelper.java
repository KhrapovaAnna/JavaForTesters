package anna.cources.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper {
    private FirefoxDriver wd;
    public SessionHelper(FirefoxDriver wd) {
        this.wd = wd;
    }
    public void login(String login, String Password) {
        wd.get("http://localhost/addressbook/");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(login);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(Password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

}
