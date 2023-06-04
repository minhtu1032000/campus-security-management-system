package controller;

import dao.ManagerDAO;
import entity.Manager;
import java.util.ArrayList;

public class ManagerController {

    private ManagerDAO managerDAO;
    private ArrayList<Manager> listManager;

    public ManagerController() {
        this.listManager = new ArrayList<>();
        managerDAO = new ManagerDAO();
    }

    public ManagerController(ArrayList<Manager> listManager) {
        this.listManager = new ArrayList<>();
        managerDAO = new ManagerDAO();
    }

    public Manager checkManagerByID(String id) {
        Manager res = null;
        for (int i = 0; i < this.listManager.size(); i++) {
            if (this.listManager.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                return listManager.get(i);
            }
        }
        return res;
    }

    public ArrayList<Manager> getManagerByID(String id) {
        ArrayList<Manager> tempList = new ArrayList<>();
        for (int i = 0; i < this.listManager.size(); i++) {
            if (this.listManager.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                tempList.add(listManager.get(i));
            }
        }
        return tempList;
    }

    public ArrayList<Manager> getListManager() {
        return listManager;
    }

    public boolean updateManagerInfo(Manager manager) {
        boolean isSucc = false;
        for (int i = 0; i < this.listManager.size(); i++) {
            if (this.listManager.get(i).getIdentityNumber().equalsIgnoreCase(manager.getIdentityNumber())) {
                this.listManager.remove(i);
                this.listManager.add(i, manager);
                isSucc = true;
                break;

            }
        }
        return isSucc;
    }

    public boolean addManager(Manager manager) {
        boolean res = false;
        if (this.checkManagerByID(manager.getIdentityNumber()) == null) {
            this.listManager.add(manager);
            res = true;
        }
        return res;
    }

    public int saveByteData() {
        this.managerDAO.saveManagerListAsByte(listManager);
        return this.listManager.size();
    }

    public int getByteData() {
        this.listManager = this.managerDAO.readManagerListAsByte();
        return this.listManager.size();
    }
}
