/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;


/**
 *
 * @author rohit
 */
public class Customer {
    String customerName;
    String customerId;
    
    static int count = 0;
    
    public Customer(){
        count++;
        customerId = "Cust"+count;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    @Override
    public String toString(){
        return customerId;
    }
    
}
