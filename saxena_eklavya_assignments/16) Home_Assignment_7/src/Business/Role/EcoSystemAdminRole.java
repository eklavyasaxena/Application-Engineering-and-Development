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
import UserInterface.EcoSystemAdminWorkArea.EcoSystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class EcoSystemAdminRole extends Role{
    
    @Override    
    public JPanel createWorkAreaJPanel(
            JPanel userProcessContainer, 
            UserAccount userAccount, 
            Organization organization, 
            Enterprise enterprise,
            Network network,
            EcoSystem ecoSystem){
        
        return new EcoSystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem);
    }
}
