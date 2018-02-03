/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseasesDrugs;

import java.util.ArrayList;
import java.util.Date;
import Business.Enterprise.ManufactureEnterprise;

/**
 *
 * @author sreer
 */
public class Vaccination {
    String name;
    String vaccineId;
    Date manufacturingDate;
    Date expiryDate;
    String batchNo;
    ManufactureEnterprise enterprise;
    private ArrayList<Integer> intervalFromDOB;
    
    public Vaccination(){
    intervalFromDOB = new ArrayList<>();
    }

    public ArrayList<Integer> getIntervalFromDOB() {
        return intervalFromDOB;
    }

    public void setIntervalFromDOB(ArrayList<Integer> intervalFromDOB) {
        this.intervalFromDOB = intervalFromDOB;
    }

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addInterval(int interval){
        intervalFromDOB.add(interval);
    }
    public void removeInterval(int interval){
        intervalFromDOB.remove(interval);
    }
    @Override
        public String toString() {
            return name;
    }
}
