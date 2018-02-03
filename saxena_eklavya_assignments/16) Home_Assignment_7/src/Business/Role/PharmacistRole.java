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
import UserInterface.PharmacistWorkArea.PharmacistWorkAreaJPanel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class PharmacistRole extends Role {
    
    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        return new PharmacistWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, network, ecoSystem);
    }
}
