/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DiseaseVaccine.Vaccine;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author eklav
 */
public class WorkRequest {
    
    private Vaccine vaccine;
    private int quantity;
    private String workRequestMessage;
    private UserAccount workRequestSender;
    private UserAccount workRequestReceiver;
    private String workRequestStatus;
    private Date workRequestDate;
    private Date workRequestResolveDate;
    
    public WorkRequest(){
        workRequestResolveDate = new Date();
    }

    public String getWorkRequestMessage() {
        return workRequestMessage;
    }
    public void setWorkRequestMessage(String workRequestMessage) {
        this.workRequestMessage = workRequestMessage;
    }

    public UserAccount getWorkRequestSender() {
        return workRequestSender;
    }
    public void setWorkRequestSender(UserAccount workRequestSender) {
        this.workRequestSender = workRequestSender;
    }

    public UserAccount getWorkRequestReceiver() {
        return workRequestReceiver;
    }
    public void setWorkRequestReceiver(UserAccount workRequestReceiver) {
        this.workRequestReceiver = workRequestReceiver;
    }

    public String getWorkRequestStatus() {
        return workRequestStatus;
    }
    public void setWorkRequestStatus(String workRequestStatus) {
        this.workRequestStatus = workRequestStatus;
    }

    public Date getWorkRequestDate() {
        return workRequestDate;
    }
    public void setWorkRequestDate(Date workRequestDate) {
        this.workRequestDate = workRequestDate;
    }

    public Date getWorkRequestResolveDate() {
        return workRequestResolveDate;
    }
    public void setWorkRequestResolveDate(Date workRequestResolveDate) {
        this.workRequestResolveDate = workRequestResolveDate;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
