/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorWorkArea.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class DoctorRole extends Role {
    
    @Override
    public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        return new DoctorWorkAreaJPanel(userProcessContainer, userAccount, (DoctorOrganization)organization, enterprise, ecoSystem);
    }
    
}
