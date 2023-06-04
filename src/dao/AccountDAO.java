package dao;

import entity.Account;
import java.io.*;
import java.util.ArrayList;

public class AccountDAO {

    private String pathStr = "Data";
    private String fileNameByte = "Account_Data_Byte.txt";

    public void saveAccountListAsByte(ArrayList<Account> accountList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathStr + "\\" + fileNameByte);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(accountList);
            oos.flush();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ArrayList<Account> readAccountListAsByte() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Account> accountList = new ArrayList<>();
        try {
            fis = new FileInputStream(pathStr + "\\" + fileNameByte);
            ois = new ObjectInputStream(fis);
            accountList = (ArrayList<Account>) ois.readObject();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return accountList;
    }

    public void addAccount(Account account) {
        ArrayList<Account> accountList = readAccountListAsByte();
        accountList.add(account);
        saveAccountListAsByte(accountList);
    }
}
