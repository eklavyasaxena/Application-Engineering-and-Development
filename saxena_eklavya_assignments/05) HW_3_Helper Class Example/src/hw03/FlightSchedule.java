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
public class FlightSchedule {
    private ArrayList<Flight> flights;
    
    public FlightSchedule() {
        flights = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
