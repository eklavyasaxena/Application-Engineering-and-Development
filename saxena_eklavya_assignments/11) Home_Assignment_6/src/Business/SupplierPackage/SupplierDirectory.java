/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eklav
 */
public class SupplierDirectory {

    private List<Supplier> supplierList;
    
    public SupplierDirectory() {
    
        supplierList = new ArrayList<Supplier>();
    }
    
    public List<Supplier> getSupplierlist(){
        return supplierList;
    }
    
        
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        return supplier;
    }
    
    public void removeSupplier(Supplier supplier){
        supplierList.remove(supplier);
    }
    
    public Supplier searchSupplier(String supplierID){
        for (Supplier supplier : supplierList) {
            if(supplier.getSupplierID().equals(supplierID)){
                return supplier;
            }
        }
        return null;
    }
}
