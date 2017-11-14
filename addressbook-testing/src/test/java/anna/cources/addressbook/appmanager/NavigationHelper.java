package anna.cources.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super (wd);
    }

    public void openGroupPage() {
        click(By.linkText("groups"));
    }

    public void openContactList() {
        click(By.linkText("home"));
    }

    public void openAddContactPage() {
        click(By.linkText("add new"));
    }
}
