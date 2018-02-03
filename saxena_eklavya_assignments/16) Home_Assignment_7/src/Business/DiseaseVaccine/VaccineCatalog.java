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
public class VaccineCatalog {
    
    ArrayList<Vaccine> vaccineList;
    
    public VaccineCatalog(){
        vaccineList = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }
    
    public Vaccine addVaccine(){
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        return vaccine;
    }
    public void deleteVaccine(Vaccine vaccine){
        vaccineList.remove(vaccine);
    }
}
