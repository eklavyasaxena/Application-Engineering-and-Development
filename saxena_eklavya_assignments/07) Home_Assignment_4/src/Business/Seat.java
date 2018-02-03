/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author eklav
 */
public class Seat {
    String seatNum;
    double seatPrice;
    String customerID;

    
    public String getSeatNum() {
        return seatNum;
    }
    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    
    public double getSeatPrice() {
        return seatPrice;
    }
    public void setSeatPrice(double seatPrice) {
        this.seatPrice = seatPrice;
    }

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    @Override
    public String toString(){
        return seatNum;
    }
}
