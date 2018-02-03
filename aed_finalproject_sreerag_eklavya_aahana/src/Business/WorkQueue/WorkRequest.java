/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.DiseasesDrugs.Vaccination;
import Business.Inventory.InventoryDirectory;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {

    private Vaccination vaccination;
    private int quantity;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private InventoryDirectory cart;
    private int tansactionStatus;// 1-> Confirm Prices, 2-> Denied, 3->accepted

    public int getTansactionStatus() {
        return tansactionStatus;
    }

    public void setTansactionStatus(int tansactionStatus) {
        this.tansactionStatus = tansactionStatus;
    }

    public InventoryDirectory getCart() {
        return cart;
    }

    public void setCart(InventoryDirectory cart) {
        this.cart = cart;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccination) {
        this.vaccination = vaccination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    @Override
    public String toString() {
        return vaccination.getName();
    }
}
