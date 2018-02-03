/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirlinersDirectory;

import Business.MasterTravelSchedule.FlightSchedule.Flight;
import Business.MasterTravelSchedule.FlightSchedule.FlightSchedule;


/**
 *
 * @author eklav
 */
public class Airliner {
    
    String airlinerID;
    String airlinerName;
    FlightSchedule flightsch;

    public String getAirlinerID() {
        return airlinerID;
    }

    public void setAirlinerID(String airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public FlightSchedule getFlightsch() {
        return flightsch;
    }

    public void setFlightsch(FlightSchedule flightsch) {
        this.flightsch = flightsch;
    }

   
    
    public Flight searchAirplane(String flightnum){
        Flight result = new Flight();
        for(Flight vs : flightsch.getFlightList()){
            if(flightnum.compareTo(vs.getFlightNum())==0){
                result = vs;
            }
        }
        return result;
    }
}
