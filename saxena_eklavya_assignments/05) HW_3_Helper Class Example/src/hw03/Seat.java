/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

/**
 *
 * @author fanzhonghao
 */
public class Seat {
    private boolean booked;
    
    public Seat() {
        booked = false;
    }
    
    public boolean isBooked() {
        return booked;
    }
    
    public void book() {
        booked = true;
    }

    public void setBooked(boolean b) {
        booked = b;
    }
    
    public String toString() {
        if (booked) {
            return "X";
        } else {
            return "O";
        }
    }
}
