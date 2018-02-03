/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public abstract class Role {
    
    public abstract JPanel createWorkAreaJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem ecoSystem);
    
    public enum RoleType{
        
        AdminRole("Administrator Role"),
        DoctorRole("Doctor Role"),
        PharmacyRole("Pharmacist"),
        InventoryClerk("InventoryClerk");
        
        private String typeName;
        
        private RoleType(String typeName){
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }

        @Override
        public String toString() {
            return typeName;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
