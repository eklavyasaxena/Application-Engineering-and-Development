/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierPackage;

import java.util.ArrayList;


/**
 *
 * @author eklav
 */
public class ProductCatalog {
    
    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void removeProduct(Product product){
        productList.remove(product);
    }
    
    public Product searchProduct(String productID){
        for (Product product : productList) {
            if(product.getProductID().equals(productID)){
                return product;
            }
        }
        return null;
    }
}
