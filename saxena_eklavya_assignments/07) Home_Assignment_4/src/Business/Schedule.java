/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class Schedule {
    
    String flightNo;
    String source;
    String destination;
    String timeOfDay;
    String airlinerID;
    String airplaneModelNo;
    String surgePricing;
    
    ArrayList<Seat> seats;
    
    public Schedule(){
        this.seats = new ArrayList<>();
        addSeats();
    }
    
    public void addSeats(){
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        String csvSeat = "seat_data.csv";
        
        try {
            br = new BufferedReader(new FileReader(csvSeat));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] seatElement = line.split(csvSplitBy);
                
                Seat seat = new Seat();
                seats.add(seat);
                String seatNum = seatElement[0];
                double seatPrice = Double.parseDouble(seatElement[1]);
                
                seat.setSeatNum(seatNum);
                seat.setSeatPrice(seatPrice);
            }
            int i=1;
            for(Seat a : seats){
                System.out.println(i+":SeatNum-->"+a.getSeatNum()+"\tSeatPrice-->"+a.getSeatPrice()+"\tCustomerID-->"+a.getCustomerID());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
    

    public String getFlightNo() {
        return flightNo;
    }
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getAirlinerID() {
        return airlinerID;
    }
    public void setAirlinerID(String airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getAirplaneModelNo() {
        return airplaneModelNo;
    }
    public void setAirplaneModelNo(String airplaneModelNo) {
        this.airplaneModelNo = airplaneModelNo;
    }

    public String getSurgePricing() {
        return surgePricing;
    }
    public void setSurgePricing(String surgePricing) {
        this.surgePricing = surgePricing;
    }
    
    
    @Override
    public String toString(){
        return flightNo;
    }
    
}
