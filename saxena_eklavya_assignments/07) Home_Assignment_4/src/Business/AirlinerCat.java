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
public class AirlinerCat {
    ArrayList<Airliner> airliners;
    
    public AirlinerCat(){
        this.airliners = new ArrayList<>();
    }

    
    public ArrayList<Airliner> getAirliners() {
        return airliners;
    }
    public void setAirliners(ArrayList<Airliner> airliners) {
        this.airliners = airliners;
    }
    
    
    public Airliner addAirliner(){
        Airliner airliner = new Airliner();
        airliners.add(airliner);
        return airliner;
    }
    
    public void deleteAirliner(Airliner airliner){
        airliners.remove(airliner);
    }
    
    public Airliner searchAirliner(String airlinerID){
        for(Airliner airliner : airliners){
            if(airliner.getAirlinerID().equals(airlinerID)){
                return airliner;
            }
        }
        return null;
    }
}
