/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseVaccine;

import java.util.ArrayList;

/**
 *
 * @author eklav
 */
public class DiseaseCatalog {
    
    ArrayList<Disease> diseaseList;
    
    public DiseaseCatalog(){
        diseaseList = new ArrayList<>();
    }
    
    public ArrayList<Disease> getDiseasesList() {
        return diseaseList;
    }

    public Disease addDisease(){
        Disease disease = new Disease();
        diseaseList.add(disease);
        return disease;
    }
    
    public void deleteDisease(Disease disease){
        diseaseList.remove(disease);
    }
}
