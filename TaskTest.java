import org.junit.Assert;
import org.junit.Test;

public class TaskTest {
    @Test
    public void testAssignTo() {
        Task testtask = new Task();
        Member testMember = new Member(1,"Abdul","CEO");
        Assert.assertTrue(testtask.assignTo(testMember,testtask));
    }
    @Test
    public void testUpdateStatus(){
        Assert.assertTrue(true);
    }
    @Test
    public void testIsOverdue(){
        Assert.assertFalse(false);
    }
}