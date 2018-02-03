/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    //Add, Search / Update Functions for ORGANIZATION
    public Organization createOrganization(Organization.OrganizationType type){
        Organization organization = null;
        
        if (type.getTypeName().equals(Organization.OrganizationType.DoctorOrganization.getTypeName())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getTypeName().equals(Organization.OrganizationType.PharmacyOrganization.getTypeName())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getTypeName().equals(Organization.OrganizationType.InventoryOrganization.getTypeName())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
