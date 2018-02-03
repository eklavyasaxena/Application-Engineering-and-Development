/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.util.ArrayList;

/**
 *
 * @author fanzhonghao
 */
public class CustomerDirectory {
    private ArrayList<Customer> customers;
    
    public CustomerDirectory() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void add(Customer p) {
        customers.add(p);
    }
    
    public void clear() {
        customers.clear();
    }
}
