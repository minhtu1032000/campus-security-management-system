package dao;

import entity.Manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManagerDAO {

    private String pathStr = "Data";
    private String fileNameByte = "Manager_Data_Byte.txt";

    public void saveManagerListAsByte(ArrayList<Manager> list) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathStr + "\\" + fileNameByte);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            oos.flush();
            //System.out.println("Manager list saved successfully.");
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

    public ArrayList<Manager> readManagerListAsByte() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Manager> list = new ArrayList<>();
        try {
            fis = new FileInputStream(pathStr + "\\" + fileNameByte);
            ois = new ObjectInputStream(fis);
            list = (ArrayList<Manager>) ois.readObject();
            //System.out.println("Account list loaded successfully.");
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
        return list;
    }

    public void addManager(Manager manager) {
        ArrayList<Manager> accountList = readManagerListAsByte();
        accountList.add(manager);
        saveManagerListAsByte(accountList);
        System.out.println("Manager added successfully.");
    }
}
