package controller;

import entity.Account;
import dao.AccountDAO;
import java.util.ArrayList;

public class AccountController {

    private ArrayList<Account> listAccount;
    private AccountDAO accountDAO;

    public AccountController() {
        this.listAccount = new ArrayList<>();
        accountDAO = new AccountDAO();
        loadAccounts();
    }

    public AccountController(ArrayList<Account> listAccount) {
        this.listAccount = new ArrayList<>();
        accountDAO = new AccountDAO();
    }

    public Account checkAccByID(String id) {
        Account resVehicle = null;
        for (int i = 0; i < this.listAccount.size(); i++) {
            if (this.listAccount.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                return listAccount.get(i);
            }
        }
        return resVehicle;
    }

    public ArrayList<Account> getAccountByID(String id) {
        ArrayList<Account> tempList = new ArrayList<>();
        for (int i = 0; i < this.listAccount.size(); i++) {
            if (this.listAccount.get(i).getIdentityNumber().equalsIgnoreCase(id)) {
                tempList.add(listAccount.get(i));
            }
        }
        return tempList;
    }

    public ArrayList<Account> getListAccount() {
        return listAccount;
    }

    public boolean updateAccountInfo(Account acc) {
        boolean isSucc = false;
        for (int i = 0; i < this.listAccount.size(); i++) {
            if (this.listAccount.get(i).getIdentityNumber().equalsIgnoreCase(acc.getIdentityNumber())) {
                this.listAccount.remove(i);
                this.listAccount.add(i, acc);
                isSucc = true;
                break;

            }
        }
        return isSucc;
    }

    public boolean addAccount(Account acc) {
        boolean res = false;
        if (this.checkAccByID(acc.getIdentityNumber()) == null) {
            this.listAccount.add(acc);
            res = true;
        }
        return res;
    }

    private void loadAccounts() {
        int numAccounts = getByteData();
        if (numAccounts > 0) {
            this.listAccount = getListAccount();
        }
    }

    public boolean isAccountExists(String id) {
        for (Account account : listAccount) {
            if (account.getIdentityNumber().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public int saveByteData() {
        this.accountDAO.saveAccountListAsByte(listAccount);
        return this.listAccount.size();
    }

    public int getByteData() {
        this.listAccount = this.accountDAO.readAccountListAsByte();
        return this.listAccount.size();
    }
}
