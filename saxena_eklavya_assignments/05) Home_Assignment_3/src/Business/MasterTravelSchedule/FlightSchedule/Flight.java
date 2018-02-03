/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MasterTravelSchedule.FlightSchedule;

import Business.MasterTravelSchedule.FlightSchedule.BunchOfSeats.BunchOfSeats;
import Business.MasterTravelSchedule.FlightSchedule.BunchOfSeats.Seat;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class Flight {
    String flightNum;
    String origin;
    String destination;
    
    BunchOfSeats seatsInFlight;

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BunchOfSeats getSeatsInFlight() {
        return seatsInFlight;
    }

    public void setSeatsInFlight(BunchOfSeats seatsInFlight) {
        this.seatsInFlight = seatsInFlight;
    }
    
    public double getSeatPrice(String seat){
        double result = 0;
        for(Seat vs : seatsInFlight.getSeatList()){
            if(seat.compareTo(vs.getSeatNum())==0){
                result = vs.getSeatPrice();
            }
        }
        return result;
    }

    
}
