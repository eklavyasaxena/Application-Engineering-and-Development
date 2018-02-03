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
public class Airliner {
    
    ArrayList<Schedule> schedules;
    
    String airlinerID;
    String airlinerName;
    
    
    public Airliner(){
        this.schedules = new ArrayList<>();
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }
    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }


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
    
    @Override
    public String toString(){
        return airlinerID;
    }
    
    
    public Schedule addFlight(){
        Schedule schedule = new Schedule();
        schedules.add(schedule);
        return schedule;
    }
    
    public void deleteFlight(Schedule schedule){
        schedules.remove(schedule);
    }
    
    public Schedule searchFlight(String flightNo){
        for(Schedule schedule : schedules){
            if(schedule.getFlightNo().equals(flightNo)){
                return schedule;
            }
        }
        return null;
    }
    
}

