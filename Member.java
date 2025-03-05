public class Member {
    int memberID;
    String memberName;
    String designation;


    public Member(int memberID, String memberName, String designation) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.designation = designation;
    }
    // Getters and Setters
    public int getMemberID() { return memberID; }
    public String getMemberName() { return memberName; }
    public String getDesignation() { return designation; }

}
