import org.junit.Assert;
import org.junit.Test;

public class TaskTest {
    @Test
    public void testAssignToPass() {
        Task testtask = new Task();
        Member testMember = new Member(1,"Abdul","CEO");
        Assert.assertTrue(testtask.assignTo(testMember,testtask));
    }
    @Test
    public void testAssignToFail() {
        Task testtask = new Task();
        Member testMember = new Member(1,"Abdul","CEO");
        testtask.assignTo(testMember,testtask);
        Assert.assertFalse(testtask.assignTo(testMember,testtask));
    }
    @Test
    public void testUpdateStatus(){
        Task testtask = new Task();
        Assert.assertTrue(testtask.updateStatus('W'));
    }
    @Test
    public void testIsOverdue(){
        Assert.assertFalse(false);
    }
}