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
public class VitalSignHistory {
    private ArrayList<VitalSigns> collectionHistory;
    
    public VitalSignHistory(){
        collectionHistory=new ArrayList<VitalSigns>(); 
    }

    public ArrayList<VitalSigns> getCollectionHistory() {
        return collectionHistory;
    }

    public void setCollectionHistory(ArrayList<VitalSigns> collectionHistory) {
        this.collectionHistory = collectionHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        collectionHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        collectionHistory.remove(v);
    }
}
