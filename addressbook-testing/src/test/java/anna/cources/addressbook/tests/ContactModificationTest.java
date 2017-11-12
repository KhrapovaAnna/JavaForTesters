package anna.cources.addressbook.tests;

import anna.cources.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {
    @Test
    public void testGroupModification() {
        app.getNavigationHelper().openContactList();
        app.getContactHelper().OpenEditDialog();
        app.getContactHelper().fillContactFields(new ContactData("Anna", "L", "Khrapova", "anna_khrapova", "-", "Tru-la-la", "Tri-ru-ru", "8888", "7777", "6666", "5555", "a@a.a", "b@b.b", "c@c.c"));
        app.getContactHelper().pressUpdateContact();
        app.getNavigationHelper().openContactList();
    }
}
