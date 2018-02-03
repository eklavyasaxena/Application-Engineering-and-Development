/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

import Business.SupplierPackage.Product;

/**
 *
 * @author rohit
 */
public class OrderItem {
    
    String orderID;
    int quantity;
    double sellingPrice;
    Product product;
    int soldItemBelowTarget = 0;
    
    static int count = 100;
    public OrderItem(){
        count++;
        orderID = "OI"+count;
    }

    public int getSoldItemBelowTarget() {
        return soldItemBelowTarget;
    }

    public void setSoldItemBelowTarget(int soldItemBelowTarget) {
        this.soldItemBelowTarget = soldItemBelowTarget;
    }
    

    public String getOrderID() {
        return orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String toString(){
        return orderID;
    }
}
