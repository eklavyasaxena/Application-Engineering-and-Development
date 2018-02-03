/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class Market {
    String marketType;
    String marketId;
    ArrayList <Customer> customerDirectory;
    
    static int count = 0;
    
    public Market(){
        count++;
        marketId = "M"+count;
        
        this.customerDirectory = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }
    
    
    public String getMarketType() {
        return marketType;
    }
    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getMarketId() {
        return marketId;
    }
    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }
    
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
     
    
    public void deleteCustomer(Customer customer){
       customerDirectory.remove(customer);
    }
    
    
    public Customer searchCustomer(String customerId){
        for(Customer c : customerDirectory){
            if(customerId.equals(c.getCustomerId())){
                return c;
            }
        }
        return null;
    }    
    
    @Override
    public String toString(){
        return marketId;
    }
}
           
