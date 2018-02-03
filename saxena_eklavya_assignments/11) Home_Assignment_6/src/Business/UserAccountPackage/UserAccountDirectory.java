/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccountPackage;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userList;
    
    public UserAccountDirectory(){
        this.userList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserList() {
        return userList;
    }
    
    
    public UserAccount addUserAccount(){
        UserAccount userAccount = new UserAccount();
        userList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount userAccount){
        userList.remove(userAccount);
    }
    
    public UserAccount searchUserAccount(String personID){
        for(UserAccount u : userList){
            if(personID.equals(u.getUserID())){
                return u;
            }
        }
        return null;
    }
}
