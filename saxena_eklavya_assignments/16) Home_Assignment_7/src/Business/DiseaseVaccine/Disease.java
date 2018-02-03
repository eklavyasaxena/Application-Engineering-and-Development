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
public class Disease {
    
    String diseaseName;
    ArrayList<Vaccine> curedByVaccineList;
    
    public Disease(){
        curedByVaccineList = new ArrayList<>();
    }

    public String getDiseaseName() {
        return diseaseName;
    }
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    
    public ArrayList<Vaccine> getCuredByVaccineList() {
        return curedByVaccineList;
    }
    
    public Vaccine addVaccine(){
        Vaccine vaccine = new Vaccine();
        curedByVaccineList.add(vaccine);
        return vaccine;
    }
    public void addVaccine(Vaccine vaccine){
        curedByVaccineList.add(vaccine);
    }
    public void deleteVaccine(Vaccine vaccine){
        curedByVaccineList.remove(vaccine);
    }
    @Override
        public String toString() {
            return diseaseName;
    }
}
