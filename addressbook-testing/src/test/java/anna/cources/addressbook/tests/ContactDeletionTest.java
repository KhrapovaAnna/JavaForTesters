package anna.cources.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.openContactList();
        app.SelectContact();
        app.DeleteContact();
        app.openContactList();
    }

}