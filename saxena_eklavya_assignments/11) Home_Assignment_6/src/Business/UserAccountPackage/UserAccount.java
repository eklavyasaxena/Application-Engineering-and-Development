/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccountPackage;

import Business.PersonPackage.Person;
import Business.SupplierPackage.Supplier;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author eklav
 */
public class UserAccount {
    String userID;
    String userName;
    String password;
    String status;
    String role;
    
    Person person;
    Supplier supplier;
    
    static int count = 500;
    public UserAccount(){
        count++;
        userID = "UA"+count;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public Supplier getSupplier() {
        return supplier;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    
    
    
    @Override
    public String toString(){
        return userID;
    }
    
    public String hash_SHA_512_SecurePassword(String pswdToHash, String salt) throws UnsupportedEncodingException{
        String generatedPassword = null;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes("UTF-8"));
            byte[] bytes = md.digest(pswdToHash.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff)+0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return generatedPassword;
    }
}
