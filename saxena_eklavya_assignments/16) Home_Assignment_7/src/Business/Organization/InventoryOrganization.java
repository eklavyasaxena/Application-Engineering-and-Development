/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryClerkRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class InventoryOrganization extends Organization{
    
    public InventoryOrganization(){
        super(Organization.OrganizationType.InventoryOrganization.getTypeName());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryClerkRole());
        return roles;
    }
     
}
