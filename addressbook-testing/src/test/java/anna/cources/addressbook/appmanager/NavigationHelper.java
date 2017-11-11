package anna.cources.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void openGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void openContactList() {
        wd.findElement(By.linkText("home")).click();
    }

    public void openAddContactPage() {
        wd.findElement(By.linkText("add new")).click();
    }
}