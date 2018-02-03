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
public class BookingLog {
    ArrayList<Booking> bookingList;
    public BookingLog(){
        this.bookingList = new ArrayList<>();
    }

    public ArrayList<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(ArrayList<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    
    public Booking addBooking(){
       Booking booking = new Booking();
        bookingList.add(booking);
        return booking;
    }
}
