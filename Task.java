import java.util.Date;
import java.util.List;

public class Task {

    int taskNumber;
    Member assignedMember;
    char taskStatus;
    Date dateAssigned;
    Date dateDue;

    // Method to assign a task to a particular team member
    public boolean assignTo(Member team_member, Task task){
        if(team_member.tasks.contains(task)){
            System.out.println("Task already assigned to team member");
            return false;
        }
        else if(team_member.tasks.isEmpty()){
            team_member.addTask(task);
            return true;
        }
        else{
            return false;
        }
    }
    // Method to update task status
    public boolean updateStatus(char new_status){
        this.taskStatus = new_status;
        return true;
    }
    // Method to check whether a task is overdue
    private boolean isOverdue(){
        return false;
    }
}
