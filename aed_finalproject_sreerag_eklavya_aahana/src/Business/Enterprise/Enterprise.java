/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Inventory.InventoryDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raunak
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private InventoryDirectory inventoryDirectory;

    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        inventoryDirectory = new InventoryDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),Distributor("Distributor"),SatelliteClinic("SatelliteClinic"),Manufacture("Manufacture");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventoryDirectory) {
        this.inventoryDirectory = inventoryDirectory;
    }
}
