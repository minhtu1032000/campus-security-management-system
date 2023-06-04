package entity;

import java.io.Serializable;

public class Manager extends Account implements Serializable {

    //private int identityNumber;
    public Manager(String username, String id, String password, String role) {
        super(username, id, password, "Manager");

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getIdentityNumber() {
        return super.getIdentityNumber();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }

}
