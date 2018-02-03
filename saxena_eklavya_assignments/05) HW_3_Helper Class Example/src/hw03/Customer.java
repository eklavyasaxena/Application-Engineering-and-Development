/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.time.LocalDate;

/**
 *
 * @author fanzhonghao
 */
public class Customer {
    private int name;
    private String destination;
    private LocalDate date;
    private Seat seat;
    
    public Customer(int n, String d, String ld) {
        name = n;
        destination = d;
        date = LocalDate.parse(ld, LocalDateHelper.dateFormatter);
        seat = null;
    }
    
    public void book(Seat s) {
        if (s.isBooked()) {
            System.out.println("Failure!  The seat is already booked by other person!");
        } else {
            seat = s;
            seat.book();
        }
    }

    public int getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
