/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.SecurityPerson;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SecurityPersonDAO {
     private String pathStr = "Data";
    private String fileNameByte = "Security_Data_Byte.txt";



    public void saveSecurityListAsByte(ArrayList<SecurityPerson> securityList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(pathStr + "\\" + fileNameByte);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(securityList);
            oos.flush();
            //System.out.println("Account list saved successfully.");
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

    public ArrayList<SecurityPerson> readSecurityListAsByte() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<SecurityPerson> securityList = new ArrayList<>();
        try {
            fis = new FileInputStream(pathStr + "\\" + fileNameByte);
            ois = new ObjectInputStream(fis);
            securityList = (ArrayList<SecurityPerson>) ois.readObject();
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
        return securityList;
    }

    public void addSecurity(SecurityPerson account) {
        ArrayList<SecurityPerson> accountList = readSecurityListAsByte();
        accountList.add(account);
        saveSecurityListAsByte(accountList);
        System.out.println("Security added successfully.");
    }
}
