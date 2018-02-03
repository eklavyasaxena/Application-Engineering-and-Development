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
public class ManufactureEnterprise extends Enterprise{

    public ManufactureEnterprise(String name) {
        super(name, EnterpriseType.Manufacture);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
