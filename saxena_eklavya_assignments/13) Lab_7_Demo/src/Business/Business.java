/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.OrganizationDirectory;



/**
 *
 * @author Administrator
 */
public class Business {
    
    private static Business business;   //Declaring the Static Instance of the Business Class
    
    private OrganizationDirectory organizationDirectory;
    
    //Public Static Method to Create an Instance of the Business Class
    public static Business getInstance(){
        if (business == null){         // Condition to Check that only one Instance is Created
            business = new Business(); //creating an object of the Class
        }
        return business;               //return the object/instance - business
    }

    //Define a Private Constructor(For Singleton Class)
    private Business() {
        organizationDirectory = new OrganizationDirectory();
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}