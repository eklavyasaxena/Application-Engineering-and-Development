/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseVaccine;

/**
 *
 * @author eklav
 */
public class Vaccine {
    
    String vaccineName;

    public String getName() {
        return vaccineName;
    }
    public void setName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    
    @Override
    public String toString() {
    return vaccineName;
    }
    
}
