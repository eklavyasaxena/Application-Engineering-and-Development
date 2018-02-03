/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MasterTravelSchedule.FlightSchedule;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class FlightSchedule {
    ArrayList<Flight> flightList;
    public FlightSchedule(){
        this.flightList = new ArrayList<>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public Flight addFlight() {
       Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
    public Flight searchFlight(String flight){
        Flight result = new Flight();
        for(Flight vs : flightList){
            if(flight.compareTo(vs.getFlightNum())==0){
                result = vs;
            }
        }
        return result;
    }
}
