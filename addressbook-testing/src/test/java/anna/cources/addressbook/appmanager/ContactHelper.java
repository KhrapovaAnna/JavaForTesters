package anna.cources.addressbook.appmanager;

import anna.cources.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void submitContactForm() {
        click (By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContactFields(ContactData contactData) {
        type (By.name("firstname"), contactData.getFirstname());
        type (By.name("middlename"), contactData.getMiddlename());
        type (By.name("lastname"), contactData.getLastname());
        type (By.name("nickname"), contactData.getNickname());
        type (By.name("title"), contactData.getTitle());
        type (By.name("company"), contactData.getCompany());
        type (By.name("address"), contactData.getAddress());
        type (By.name("home"), contactData.getHomePhone());
        type (By.name("mobile"), contactData.getMobilePhone());
        type (By.name("work"), contactData.getWorkPhone());
        type (By.name("fax"), contactData.getFax());
        type (By.name("email"), contactData.getEmail());
        type (By.name("email2"), contactData.getEmail2());
        type (By.name("email3"), contactData.getEmail3());
    }

    public void DeleteContact() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }

    public void SelectContact() {
        click(By.name("selected[]"));
    }
}
