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
public class Customer {
    
    String customerID;
    String firstName;
    String lastName;
    String eMail;
    String phoneNum;
    String seatNum;
    double bookedSeatPrice;

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getSeatNum() {
        return seatNum;
    }
    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public double getBookedSeatPrice() {
        return bookedSeatPrice;
    }
    public void setBookedSeatPrice(double bookedSeatPrice) {
        this.bookedSeatPrice = bookedSeatPrice;
    }

    
    
    
    @Override
    public String toString(){
        return customerID;
    }
}
