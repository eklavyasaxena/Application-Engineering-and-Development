/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public Organization(String name){
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        counter++;
    }
    
    public enum OrganizationType{
        AdminOrganization("Administrator Organization"),
        DoctorOrganization("Doctor Organization"),
        PharmacyOrganization("Pharmacy Organization"),
        InventoryOrganization("Inventory Organization");
        
        private String typeName;
        
        private OrganizationType(String typeName){
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }
    
    
    @Override
    public String toString(){
        return name;
    }
}
