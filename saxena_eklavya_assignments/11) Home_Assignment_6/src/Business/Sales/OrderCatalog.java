/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class OrderCatalog {
    
    private ArrayList<Order> orderList;

    public OrderCatalog() {
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    
    public void removeorder(Order order){
        orderList.remove(order);
    }
    
    public Order searchorder(String orderID){
        for (Order order : orderList) {
            if(order.getOrderNumber().compareTo(orderID)==0){
                return order;
            }
        }
        return null;
    }
    
}
