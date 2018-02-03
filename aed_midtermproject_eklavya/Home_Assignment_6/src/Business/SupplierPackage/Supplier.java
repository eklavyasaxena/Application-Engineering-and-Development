/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierPackage;

/**
 *
 * @author eklav
 */
public class Supplier {
    
    private String supplierID;
    private String supplierName;
    private ProductCatalog productCatalog;
    
    private static int count =500;

    public Supplier() {
        productCatalog = new ProductCatalog();
        
        count++;
        supplierID = "S"+count;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    
    //To change body of generated methods, choose Tools | Templates.
    @Override
    public String toString() {
        return supplierID;
    }
    
    
    
    
}
