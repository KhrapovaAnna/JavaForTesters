package anna.cources.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    
    @Test
    public void testGroupDeletion() {
        openGroupPage();
        selectGroup();
        deleteGroup();
        openGroupPage();
    }

}
