/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Role;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        String username = userName.toLowerCase();
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
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
    
    //Add, Search / Update Functions for USERACCOUNT
    public UserAccount createNewUserAccount(String username, String password, Employee employee, Role role,EcoSystem eco){
        
        for(Network net : eco.getNetworkList()){
            System.out.println(net.getName());
            for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
                System.out.println(ent.getName());
                for(UserAccount ua : ent.getUserAccountDirectory().getUserAccountList()){
                    System.out.println(ua.getUsername());
                    if(ua.getUsername().equalsIgnoreCase(username)){
                        return null;
                    }
                }
            }
        }
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
}
