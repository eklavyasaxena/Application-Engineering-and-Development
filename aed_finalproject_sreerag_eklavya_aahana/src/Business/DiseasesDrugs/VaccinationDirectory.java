/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseasesDrugs;

import java.util.ArrayList;

/**
 *
 * @author sreer
 */
public class VaccinationDirectory {
    ArrayList<Vaccination> vaccinationDirectory;
    public VaccinationDirectory(){
        vaccinationDirectory = new ArrayList<>();
    }

    public ArrayList<Vaccination> getvaccinationDirectory() {
        return vaccinationDirectory;
    }

    public void setvaccinationDirectory(ArrayList<Vaccination> vaccinationDirectory) {
        this.vaccinationDirectory = vaccinationDirectory;
    }
    public Vaccination addVaccination(){
        Vaccination vaccination = new Vaccination();
        vaccinationDirectory.add(vaccination);
        return vaccination;
    }
    public void deleteVaccination(Vaccination vaccination){
        vaccinationDirectory.remove(vaccination);
    }
}
