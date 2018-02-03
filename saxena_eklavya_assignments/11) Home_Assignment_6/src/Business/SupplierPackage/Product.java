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
public class Product {
    
    private String prodName;
    private double costPrice;
    private String productID;
    private int availNum;
    private double totalRevenueGenerated;
    private int qtytSold;
    
    private static int count =0;

    public Product() {
        count++;
        productID = "P"+count;
    }

    public int getQtytSold() {
        return qtytSold;
    }

    public void setQtytSold(int qtytSold) {
        this.qtytSold = qtytSold;
    }
    

    public double getTotalRevenueGenerated() {
        return totalRevenueGenerated;
    }

    public void setTotalRevenueGenerated(double totalRevenueGenerated) {
        this.totalRevenueGenerated = totalRevenueGenerated;
    }
    

    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public String getProductID() {
        return productID;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getAvailNum() {
        return availNum;
    }
    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }
    
    //To change body of generated methods, choose Tools | Templates.
    @Override
    public String toString() {
        return productID;
    }
}
