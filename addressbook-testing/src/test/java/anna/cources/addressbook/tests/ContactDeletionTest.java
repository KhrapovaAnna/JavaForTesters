package anna.cources.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().openContactList();
        app.getContactHelper().SelectContact();
        app.getContactHelper().DeleteContact();
        app.getNavigationHelper().openContactList();
    }

}