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
public class DiseasesDirectory {
    ArrayList<Diseases> diseasesDirectory;
    public DiseasesDirectory(){
        diseasesDirectory = new ArrayList<>();
    }
    public ArrayList<Diseases> getDiseasesDirectory() {
        return diseasesDirectory;
    }

    public void setDiseases(ArrayList<Diseases> diseasesDirectory) {
        this.diseasesDirectory = diseasesDirectory;
    }
    public Diseases addDiseases(){
        Diseases diseases = new Diseases();
        diseasesDirectory.add(diseases);
        return diseases;
    }
    public void deleteDiseases(Diseases diseases){
        diseasesDirectory.remove(diseases);
    }
}
