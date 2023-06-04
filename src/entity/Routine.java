package entity;

public class Routine {

    private SecurityPerson securityPerson;

    public Routine(SecurityPerson securityPerson) {
        this.securityPerson = securityPerson;
    }

    public void displayRoutine() {
        String dutyStartTime = securityPerson.getDutyStartTime();
        String dutyEndTime = securityPerson.getDutyEndTime();
        String date = securityPerson.getDate();
        String place = securityPerson.getPlace();
    }

    public SecurityPerson getSecurityPerson() {
        return securityPerson;
    }

    public void setSecurityPerson(SecurityPerson securityPerson) {
        this.securityPerson = securityPerson;
    }
    
}
