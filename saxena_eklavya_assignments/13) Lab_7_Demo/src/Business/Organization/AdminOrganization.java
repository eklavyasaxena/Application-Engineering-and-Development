/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
/*Extends the abstract class Organization and defines the
declared method 'getSupportedRole()' in its body.
And hence an object of this class can be instantiated.
*/
public class AdminOrganization extends Organization{

    public AdminOrganization() {
        /*Calls the Paramaterized Constructor of Organization
        and passes the String name as parameter to it.
        Every Class has by default a constructor called super();
        */
        super(Type.Admin.getValue());
    }
    
    
    /*Method definition defined and hence AdminOrganization 
    is now a concrete class
    */
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
     
}
