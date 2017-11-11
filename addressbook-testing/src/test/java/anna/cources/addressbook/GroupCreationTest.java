package anna.cources.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void newGroup_test() {
        openGroupPage();
        pressNewGroup();
        fillNewGroupFields(new GroupData("AnnaTest1", "Test1", "Test1.1"));
        submitNewGroup();
        openGroupPage();
    }

}
