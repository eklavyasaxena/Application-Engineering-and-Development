/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.EcoSystemAdminRole;
import Business.UserAccount.UserAccount;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author eklav
 */
public class ConfigureASystem {
    
    public static EcoSystem configureSystem() throws UnsupportedEncodingException{
        
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        //Create a Network
        //Create an Enterprise
        //Initialize Some Organizations
        //Have Some Employees 
        //Create User Account
        
        //Create an Employee
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("Eklavya Saxena");
        //Create an UserAccount for that Employee
        String pswd = ecoSystem.getUserAccountDirectory().hash_SHA_512_SecurePassword("sysadmin", "COEXIST");
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createNewUserAccount("sysadmin", pswd, employee, new EcoSystemAdminRole(),ecoSystem);
        
        
        return ecoSystem;
    }
    
}
