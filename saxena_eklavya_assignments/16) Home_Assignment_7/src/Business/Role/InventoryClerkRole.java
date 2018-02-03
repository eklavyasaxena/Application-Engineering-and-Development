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
import UserInterface.InventoryClerkWorkArea.InventoryClerkWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author eklav
 */
public class InventoryClerkRole extends Role {

   @Override
   public JPanel createWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
       return new InventoryClerkWorkAreaJPanel(userProcessContainer, account, organization,enterprise,network , business);
   }
   
}
