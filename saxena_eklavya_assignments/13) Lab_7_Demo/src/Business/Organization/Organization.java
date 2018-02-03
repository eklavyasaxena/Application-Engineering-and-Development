/*
 * To change this template, choose Tools | Templates
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
 * @author raunak
 */
//Abstract because it must have at least one abstract method declared in it
// And hence we cannot create an object of Organization
public abstract class Organization {
    
    //Abstract Method: which is only declared
    public abstract ArrayList<Role> getSupportedRole();
    

    private String name;
    private int organizationID;
    private static int counter;
    
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    // Defining ENUM named as "Type" inside the Class Organization
    //At BackEnd, the compiler actually creates a class Enum, with all the constants as final static
    public enum Type{
        /* Specifying the values inside the constants, so that whenver the method getValue is called, the specified
        string is returned. Consider it the following way:
        ------------------------
        class Type{
        static final Type Admin = new Type("Admin Organization");
        static final Type Doctor = new Type("Doctor Organization");
        static final Type Lab = new Type("Lab Organization");
        }
        ------------------------
        enum extends Enum Class which is abstract which further extends to Object Class 
        (and hnece, there are many methods that we can use)
        Therefore cannot extend any other class, but it can implemet an interface.
        
        Also, values() method which is given by JVM, will help us to feed an array with the
        constants name, as follows:
        Type t[] = Type.values();
        We can use an enhanced loop to print this array.
        
        Also, we have a method defined in Enum Class: ordinal() to print the order
        */
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Doctor("Doctor Organization"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Lab("Lab Organization"){
//            public Organization createOrganization() {
//                return new LabOrganization();
//            }
        };
        
        //Variable value declared inside the Enum Type
        private String value;   
        
        //Paramaterized Constructor created inside the Enum
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    /*Paramaterized Constructor of Organization
    Can be called by Child Class using super("name") method.
    */
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
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
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

    @Override
    public String toString() {
        return name;
    }
    
    
}
