package anna.cources.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().openGroupPage();
    }

}
