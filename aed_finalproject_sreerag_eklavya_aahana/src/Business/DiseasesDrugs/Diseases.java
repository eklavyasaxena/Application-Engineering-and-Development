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
public class Diseases {
    String name;
    ArrayList<Vaccination> curedByVaccinations;
    
    public Diseases(){
        curedByVaccinations = new ArrayList<>();
    }

    public ArrayList<Vaccination> getCuredByVaccinations() {
        return curedByVaccinations;
    }

    public void setCuredByVaccinations(ArrayList<Vaccination> curedByVaccinations) {
        this.curedByVaccinations = curedByVaccinations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Vaccination addVaccination(){
        Vaccination vaccination = new Vaccination();
        curedByVaccinations.add(vaccination);
        return vaccination;
    }
    public void addVaccination(Vaccination vac){
        curedByVaccinations.add(vac);
    }
    public void deleteVaccination(Vaccination vaccination){
        curedByVaccinations.remove(vaccination);
    }
    @Override
        public String toString() {
            return name;
    }
}
