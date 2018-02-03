/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirlinersDirectory;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class AirlinersDirectory {
    ArrayList<Airliner> airlinerList;

    public AirlinersDirectory(){
        this.airlinerList = new ArrayList<>();
    }

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    
    public Airliner addAirliner() {
        Airliner airliner = new Airliner ();
        airlinerList.add(airliner);
        return airliner; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Airliner searchAirliner(String airliner){
         Airliner result = new Airliner();
        for(Airliner vs : airlinerList){
            if(airliner.compareTo(vs.getAirlinerID())==0){
                result = vs;
            }
        }
        return result;
    }
    
    
}
