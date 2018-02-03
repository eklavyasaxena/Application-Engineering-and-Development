/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author fanzhonghao
 */
public class TravelAgency implements Serializable {
    private ArrayList<Airliner> airliners;
    private MasterTravelSchedule mts;
    private CustomerDirectory cd;

    public TravelAgency() {
        airliners = new ArrayList<>();
        mts = new MasterTravelSchedule();
        cd = new CustomerDirectory();
    }

    public ArrayList<Airliner> getAirliners() {
        return airliners;
    }

    public MasterTravelSchedule getMts() {
        return mts;
    }

    public CustomerDirectory getCd() {
        return cd;
    }
    
    public void addAirliner(Airliner a) {
        airliners.add(a);
    }    
    
    public int getRevenue() {
        int revenue = 0;
        for (Airliner a : airliners) {
            revenue += a.getRevenue();
        }
        return revenue;
    }
}
