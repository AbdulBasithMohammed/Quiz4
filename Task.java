import java.util.Date;

public class Task {

    int taskNumber;
    Member assignedMember;
    char taskStatus;
    Date dateAssigned;
    Date dateDue;

    // Method to assign a task to a particular team member
    public boolean assignTo(Member team_member){

        return true;
    }
    // Method to update task status
    private boolean updateStatus(String new_status){
        return true;
    }
    // Method to check whether a task is overdue
    private boolean isOverdue(){
        return false;
    }
}
