package anna.cources.addressbook.appmanager;

import anna.cources.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super (wd);
    }

    public void submitContactForm() {
        click (By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactFields(ContactData contactData) {
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

    public void OpenEditDialog() {click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));}

    public void pressUpdateContact() {click(By.name("update")); }
}
