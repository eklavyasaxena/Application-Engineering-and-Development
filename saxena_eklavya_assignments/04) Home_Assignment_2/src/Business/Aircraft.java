/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


/**
 *
 * @author eklav
 */
public class Aircraft {
    private String makeOfAircraft;
    private int serialNum;
    private String maintCertification;
    private int modelNum;
    private int makeYear;
    private String airport;
    private String departTime;
    private int numOfSeats;
    
    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getMakeOfAircraft() {
        return makeOfAircraft;
    }

    public void setMakeOfAircraft(String makeOfAircraft) {
        this.makeOfAircraft = makeOfAircraft;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getMaintCertification() {
        return maintCertification;
    }

    public void setMaintCertification(String maintCertification) {
        this.maintCertification = maintCertification;
    }
    
    @Override
    public String toString(){
        return this.makeOfAircraft;
    }
}
