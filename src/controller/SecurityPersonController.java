package controller;

import entity.SecurityPerson;
import dao.SecurityPersonDAO;
import java.util.ArrayList;
import tableModel.ManagerTableModel;

public class SecurityPersonController {

    private SecurityPersonDAO securityDAO;
    private ArrayList<SecurityPerson> listSecurity;

    public SecurityPersonController() {
        this.listSecurity = new ArrayList<>();
        securityDAO = new SecurityPersonDAO();
    }

    public SecurityPersonController(ArrayList<SecurityPerson> list) {
        this.listSecurity = new ArrayList<>();
        securityDAO = new SecurityPersonDAO();
    }

    public SecurityPerson checkSecurityByID(String id) {
        SecurityPerson res = null;
        for (int i = 0; i < this.listSecurity.size(); i++) {
            if (this.listSecurity.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                return listSecurity.get(i);
            }
        }
        return res;
    }

    public ArrayList<SecurityPerson> getSecurityByID(String id) {
        ArrayList<SecurityPerson> res = new ArrayList<>();
        for (int i = 0; i < this.listSecurity.size(); i++) {
            if (this.listSecurity.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                res.add(listSecurity.get(i));
            }
        }
        return res;
    }

    public ArrayList<SecurityPerson> getSecurityByName(String name) {
        ArrayList<SecurityPerson> tempList = new ArrayList<>();
        for (int i = 0; i < this.listSecurity.size(); i++) {
            if (this.listSecurity.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                tempList.add(listSecurity.get(i));
            }
        }
        return tempList;
    }

    public ArrayList<SecurityPerson> getSecurityByPlace(String place) {
        ArrayList<SecurityPerson> tempList = new ArrayList<>();
        for (int i = 0; i < this.listSecurity.size(); i++) {
            SecurityPerson securityPerson = this.listSecurity.get(i);
            if (securityPerson.getPlace() != null && securityPerson.getPlace().equalsIgnoreCase(place)) {
                tempList.add(securityPerson);
            }
        }
        return tempList;
    }

    public ArrayList<SecurityPerson> getSecurityByDate(String date) {
        ArrayList<SecurityPerson> tempList = new ArrayList<>();
        for (int i = 0; i < this.listSecurity.size(); i++) {
            SecurityPerson securityPerson = this.listSecurity.get(i);
            if (securityPerson.getDate() != null && securityPerson.getDate().equalsIgnoreCase(date)) {
                tempList.add(securityPerson);
            }
        }
        return tempList;
    }

    public ArrayList<SecurityPerson> getListSecurity() {
        return listSecurity;
    }

    public boolean updateSecurityInfo(SecurityPerson security) {
        boolean isSucc = false;
        for (int i = 0; i < this.listSecurity.size(); i++) {
            if (this.listSecurity.get(i).getIdentityNumber().equalsIgnoreCase(security.getIdentityNumber())) {
                this.listSecurity.remove(i);
                this.listSecurity.add(i, security);
                isSucc = true;
                break;

            }
        }
        return isSucc;
    }

    public boolean addSecurity(SecurityPerson security) {
        boolean res = false;
        if (this.checkSecurityByID(security.getIdentityNumber()) != null) {
            this.listSecurity.add(security);
            res = true;
        }
        return res;
    }

    public boolean deleteSecurityByID(String id) {
        boolean res = false;
        SecurityPerson temp = this.checkSecurityByID(id);
        if (temp != null) {
            this.listSecurity.remove(temp);
            res = true;
        }
        return res;
    }

    public ManagerTableModel sortVehicleByID() {
        listSecurity.sort((v1, v2) -> {
            int compare = v1.getIdentityNumber().compareTo(v2.getIdentityNumber());
            if (compare == 0) {
                compare = v1.getDate().compareTo(v2.getDate());
            }
            return compare;
        });
        ManagerTableModel sortID = new ManagerTableModel(listSecurity);
        return sortID;
    }

    public int saveByteData() {
        this.securityDAO.saveSecurityListAsByte(listSecurity);
        return this.listSecurity.size();
    }

    public int getByteData() {
        this.listSecurity = this.securityDAO.readSecurityListAsByte();
        return this.listSecurity.size();
    }
}
