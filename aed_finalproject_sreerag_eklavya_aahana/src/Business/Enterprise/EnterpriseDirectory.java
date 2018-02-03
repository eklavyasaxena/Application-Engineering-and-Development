/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Distributor) {
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        } 
            else if (type == Enterprise.EnterpriseType.Manufacture) {
            enterprise = new ManufactureEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }

    public void deleteEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
    
public Enterprise updateEnterprise(Enterprise enterprise, String name, Enterprise.EnterpriseType type)
    {
    enterpriseList.remove(enterprise);
   
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Distributor) {
            enterprise = new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        } 
            else if (type == Enterprise.EnterpriseType.Manufacture) {
            enterprise = new ManufactureEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }

}
