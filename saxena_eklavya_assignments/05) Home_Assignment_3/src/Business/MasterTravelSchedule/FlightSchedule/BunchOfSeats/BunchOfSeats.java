/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MasterTravelSchedule.FlightSchedule.BunchOfSeats;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class BunchOfSeats {
    ArrayList<Seat> seatList;
    public BunchOfSeats(){
        this.seatList = new ArrayList<>();
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }
    
    public Seat addSeat() {
       Seat seat = new Seat();
        seatList.add(seat);
        return seat;
    }
    
    public Seat searchSeat(String seat){
        Seat result = new Seat();
        for(Seat vs : seatList){
            if(seat.compareTo(vs.getSeatNum())==0){
                result = vs;
            }
        }
        return result;
    }
}
