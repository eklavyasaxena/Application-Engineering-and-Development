/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DistributorEnterprise extends Enterprise{

    public DistributorEnterprise(String name) {
        super(name, EnterpriseType.Distributor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
