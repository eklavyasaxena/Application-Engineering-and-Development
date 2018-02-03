/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class CustomerCat {
    ArrayList<Customer> customers;
    
    public CustomerCat(){
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customers.add(customer);
        return customer;
    }
//    Check If Possible
//    public void deleteCustomer(Customer customer){
//        customers.remove(customer);
//    }
//    
//    public Customer searchCustomer(String customerID){
//        for(Customer customer : customers){
//            if(customer.getCustomerID().equals(customerID)){
//                return customer;
//            }
//        }
//        return null;
//    }
}
