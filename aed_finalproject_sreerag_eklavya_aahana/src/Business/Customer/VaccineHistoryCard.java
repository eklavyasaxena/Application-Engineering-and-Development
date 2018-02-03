/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DiseasesDrugs.Vaccination;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eklav
 */
public class VaccineHistoryCard {
    
    private ArrayList<VaccineAdministered> vaccineAdministeredList;
    
    
    
    public VaccineHistoryCard(){
        vaccineAdministeredList = new ArrayList<>();
    }

    public ArrayList<VaccineAdministered> getVaccineAdministeredList() {
        return vaccineAdministeredList;
    }

    public void setVaccineAdministeredList(ArrayList<VaccineAdministered> vaccineAdministeredList) {
        this.vaccineAdministeredList = vaccineAdministeredList;
    }
    public VaccineAdministered addVaccineAdministered(){
        VaccineAdministered va = new VaccineAdministered();
        vaccineAdministeredList.add(va);
        return va;
    }
    public void addVaccineAdministered(VaccineAdministered va){
        vaccineAdministeredList.add(va);
    }
    public void delVaccineAdministered(VaccineAdministered va){
        vaccineAdministeredList.add(va);
    }


//    @Override
//    public String toString(){
//        return vaccinationDueOnNextVisit.getName();
//    }
    
}
