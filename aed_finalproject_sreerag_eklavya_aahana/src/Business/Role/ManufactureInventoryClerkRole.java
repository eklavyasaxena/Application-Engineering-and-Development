/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.InventoryClerk.InventoryClerkWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Manufacture.ManufactureInventoryClerkWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ManufactureInventoryClerkRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new ManufactureInventoryClerkWorkAreaJPanel(userProcessContainer, account, organization,enterprise,network , business);
    }
    
}
