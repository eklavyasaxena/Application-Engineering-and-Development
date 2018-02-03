/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.util.ArrayList;

/**
 *
 * @author fanzhonghao
 */
public class MasterTravelSchedule {
    
    private ArrayList<Flight> masterFlights;
    
    public MasterTravelSchedule() {
        masterFlights = new ArrayList<>();
    }

    public ArrayList<Flight> getMasterFlights() {
        return masterFlights;
    }
    
    public void refresh(TravelAgency ta) {
        masterFlights.clear();
        for (Airliner al : ta.getAirliners()) {
            for (Flight f : al.getFs().getFlights()) {
                masterFlights.add(f);
            }
        }
    }
}
