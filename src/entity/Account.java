package entity;

import java.io.Serializable;

public class Account implements Serializable {

    private String name;
    private String identityNumber;
    private String password;
    private String role;

    public Account(String name, String identityNumber, String password, String role) {
        this.name = name;
        this.identityNumber = identityNumber;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String position) {
        this.role = position;
    }
//
//    public void requestLeave(int numOfDays) {
//        if (numOfDays <= getRemainingLeaves()) {
//            leavesTaken += numOfDays;
//            System.out.println("Leave request approved.");
//        } else {
//            System.out.println("Leave request declined. Insufficient remaining leaves.");
//        }
//    }

    public void doOverDuty() {
        System.out.println("Request for doing over duty sent to the manager.");
    }

    public void viewSchedule() {

    }
}
