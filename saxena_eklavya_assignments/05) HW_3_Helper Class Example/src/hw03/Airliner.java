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
public class Airliner {
    private String name;
    private ArrayList<Airplane> airplanes;
    private FlightSchedule fs;
    
    public Airliner(String n) {
        name = n;
        airplanes = new ArrayList<>();
        fs = new FlightSchedule();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Airplane> getAirplanes() {
        return airplanes;
    }

    public FlightSchedule getFs() {
        return fs;
    }
    
    public void addAirplane(Airplane a) {
        airplanes.add(a);
    }
    
    public int getRevenue() {
        int revenue = 0;
        for (Flight f : fs.getFlights()) {
            revenue += f.getRevenue();
        }
        return revenue;
    }
}
