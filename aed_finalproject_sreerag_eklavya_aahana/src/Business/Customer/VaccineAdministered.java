/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DiseasesDrugs.Vaccination;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eklav
 */
public class VaccineAdministered {
    
    private int vaccineAdministeredID;
    private static int count = 1;
    
    private Enterprise enterprise; //Hospital where child took his/her vaccine
    private UserAccount doctor; //Who administered the vaccine
    private Vaccination vaccination; //Vaccine Administered
    private Date vaccineAdministeredDate; //Vaccine taken on
    private Date vaccineDueDate;

    
    
    public VaccineAdministered(){
        //Enterprise declaration problem
        doctor = new UserAccount();
        vaccination = new Vaccination();
        vaccineAdministeredDate = null;
        vaccineDueDate = new Date();
        vaccineAdministeredID = count;
        count++;
        
        
    }

    public Date getVaccineDueDate() {
        return vaccineDueDate;
    }

    public void setVaccineDueDate(Date vaccineDueDate) {
        this.vaccineDueDate = vaccineDueDate;
    }

    public int getVaccineAdministeredID() {
        return vaccineAdministeredID;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccinationTaken) {
        this.vaccination = vaccinationTaken;
    }

    public Date getVaccineAdministeredDate() {
        return vaccineAdministeredDate;
    }

    public void setVaccineAdministeredDate(Date vaccineAdministeredDate) {
        this.vaccineAdministeredDate = vaccineAdministeredDate;
    }
    
    @Override
    public String toString() {
        
        return String.valueOf(vaccineAdministeredID);
    }
    
    
}
