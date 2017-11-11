package anna.cources.addressbook.tests;

import anna.cources.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void newGroup_test() {
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().pressNewGroup();
        app.getGroupHelper().fillNewGroupFields(new GroupData("AnnaTest1", "Test1", "Test1.1"));
        app.getGroupHelper().submitNewGroup();
        app.getNavigationHelper().openGroupPage();
    }

}
