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
public class Order {
    private ArrayList<OrderItem> orderItemList;
    
    private int orderNumber;
    private static int count = 0;
    
    public Order(){
        orderItemList = new ArrayList<OrderItem>();
        
        count++;
        orderNumber = count;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public OrderItem addOrderItem(Product product, int quantity, double salesPrice){
        
        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setQuantity(quantity);
        orderItem.setSalesPrice(salesPrice);
        
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }
}
