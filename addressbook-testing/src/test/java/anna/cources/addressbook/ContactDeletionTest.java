package anna.cources.addressbook;

import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        openContactList();
        SelectContact();
        DeleteContact();
        openContactList();
    }

}