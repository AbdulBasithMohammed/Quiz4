import java.util.ArrayList;
import java.util.List;

public class Member {
    int memberID;
    String memberName;
    String designation;
    List<Task> tasks=new ArrayList<>();


    public Member(int memberID, String memberName, String designation) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.designation = designation;
    }
    // Getters and Setters
    public int getMemberID() { return memberID; }
    public String getMemberName() { return memberName; }
    public String getDesignation() { return designation; }
    public List<Task> getTasks() { return tasks; }
    public void setMemberID(int memberID) { this.memberID = memberID; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setTasks(List<Task> tasks) { this.tasks = tasks; }
    public void addTask(Task task) { this.tasks.add(task); }

}
