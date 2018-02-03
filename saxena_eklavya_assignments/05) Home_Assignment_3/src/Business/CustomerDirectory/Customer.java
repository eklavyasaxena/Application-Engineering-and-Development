/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerDirectory;

/**
 *
 * @author eklav
 */
public class Customer {
    int customerUID;
    String customerName;
    String customerEmailID;

    public int getCustomerUID() {
        return customerUID;
    }

    public void setCustomerUID(int customerUID) {
        this.customerUID = customerUID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailID() {
        return customerEmailID;
    }

    public void setCustomerEmailID(String customerEmailID) {
        this.customerEmailID = customerEmailID;
    }

    
}
