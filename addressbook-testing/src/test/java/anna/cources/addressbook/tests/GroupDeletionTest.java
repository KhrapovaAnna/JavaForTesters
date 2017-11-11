package anna.cources.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
        app.openGroupPage();
        app.selectGroup();
        app.deleteGroup();
        app.openGroupPage();
    }

}
