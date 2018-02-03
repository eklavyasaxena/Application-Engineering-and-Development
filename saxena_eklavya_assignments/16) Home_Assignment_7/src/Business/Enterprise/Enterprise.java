/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author eklav
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type){
        //Super Constructor
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        
        HospitalEnterprise("Hospital Enterprise"),
        DistributorEnterprise("Distributor Enterprise"),
        StatelliteClinicEnterprise("StatelliteClinic Enterprise");
        
        private String typeName;
        
        private EnterpriseType(String typeName){
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }
        
        @Override
        public String toString(){
            return typeName;
        }
        
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
