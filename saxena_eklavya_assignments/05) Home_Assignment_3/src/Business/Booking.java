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
public class Booking {
    String bookingID;
    String airlinerID;
    String flightNum;
    String airplaneID;

    public String getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }
    int customerUID;
    String seatNum;

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getAirlinerID() {
        return airlinerID;
    }

    public void setAirlinerID(String airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getCustomerUID() {
        return customerUID;
    }

    public void setCustomerUID(int customerUID) {
        this.customerUID = customerUID;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }
    
}
