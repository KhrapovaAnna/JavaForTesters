package anna.cources.addressbook.tests;

import anna.cources.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().pressEditGroup();
        app.getGroupHelper().fillGroupFields(new GroupData("AnnaTest1", "Test1", "Test1.1"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().openGroupPage();
    }
}
