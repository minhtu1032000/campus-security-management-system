package entity;

import java.io.Serializable;

public class SecurityPerson extends Account implements Serializable {

    private String dutyStartTime;
    private String dutyEndTime;
    private String date;
    private String place;
//    private int leavesTaken = 0;
//    private int remainingLeaves = 5;

    public SecurityPerson(String dutyStartTime, String dutyEndTime, String date, String place, String name, String id, String password, String role) {
        super(name, id, password, "Security");
        this.dutyStartTime = dutyStartTime;
        this.dutyEndTime = dutyEndTime;
        this.date = date;
        this.place = place;
//        this.leavesTaken = leavesTaken;
//        this.remainingLeaves = remainingLeaves;
    }


    public SecurityPerson(String name, String id, String password, String role) {
        super(name, id, password, "Security");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getIdentityNumber() {
        return super.getIdentityNumber();
    }

    public String getDutyStartTime() {
        return dutyStartTime;
    }

    public String getDutyEndTime() {
        return dutyEndTime;
    }

    public String getPlace() {
        return place;
    }

//    public int getLeavesTaken() {
//        return leavesTaken;
//    }
//
//    public int getRemainingLeaves() {
//        return remainingLeaves;
//    }

    public void setDutyStartTime(String dutyStartTime) {
        this.dutyStartTime = dutyStartTime;
    }

    public void setDutyEndTime(String dutyEndTime) {
        this.dutyEndTime = dutyEndTime;
    }

    public void setPlace(String place) {
        this.place = place;
    }

//    public void requestLeave() {
//        leavesTaken++;
//        remainingLeaves--;
//    }

    public void requestOverDuty() {
        // Logic for requesting over duty
    }
}
