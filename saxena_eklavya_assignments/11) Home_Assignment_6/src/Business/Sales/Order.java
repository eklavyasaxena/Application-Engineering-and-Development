/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sales;


import Business.Market.Customer;
import Business.Market.Market;
import Business.PersonPackage.Person;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class Order {
   
    private ArrayList<OrderItem> orderItemList;
    private String orderNumber;
    double totalSellingPrice;
    double totalTargetPrice;
    double totalCostPrice;
    int soldBelowTarget = 0;
    
    double rewardsEarned;
    
    Market market;
    Person person;
    Customer customer;
    
    
    private static int count=0;
    
    public Order(){
        count++;
        orderNumber= "SO"+count;
        
        orderItemList=new ArrayList<OrderItem>();
        this.market = new Market();
        this.person = new Person();
        this.customer = new Customer();

    }

    public int getSoldBelowTarget() {
        return soldBelowTarget;
    }

    public void setSoldBelowTarget(int soldBelowTarget) {
        this.soldBelowTarget = soldBelowTarget;
    }
    
    

    public double getTotalCostPrice() {
        return totalCostPrice;
    }

    public void setTotalCostPrice(double totalCostPrice) {
        this.totalCostPrice = totalCostPrice;
    }
    
    

    public double getRewardsEarned() {
        return rewardsEarned;
    }

    public void setRewardsEarned(double rewardsEarned) {
        this.rewardsEarned = rewardsEarned;
    }
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }


    public double getTotalSellingPrice() {
        return totalSellingPrice;
    }

    public void setTotalSellingPrice(double totalSellingPrice) {
        this.totalSellingPrice = totalSellingPrice;
    }

    public double getTotalTargetPrice() {
        return totalTargetPrice;
    }

    public void setTotalTargetPrice(double totalTargetPrice) {
        this.totalTargetPrice = totalTargetPrice;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    
    
    public OrderItem addOrderItem(){
        OrderItem o = new OrderItem();
        orderItemList.add(o);
        return o;
    
    }
    
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
    public OrderItem searchOrderItem(String orderID){
        for(OrderItem o:orderItemList){
            if(orderID.equals(o.getOrderID())){
                return o;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return orderNumber;
    }
    
}
