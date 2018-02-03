/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CustomerDirectory;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;
    public CustomerDirectory() {
        this.customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer() {
       Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }
}
