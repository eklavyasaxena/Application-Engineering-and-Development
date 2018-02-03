/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import Business.DiseasesDrugs.Diseases;
import Business.DiseasesDrugs.Vaccination;
import Business.Enterprise.Enterprise;

/**
 *
 * @author sreer
 */
public class InventoryItem {
    private Vaccination vacination;
    private int quantity;
    private int producedReceivedQuantity;
    private Enterprise enterprise;


    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vaccination getVacination() {
        return vacination;
    }

    public void setVacination(Vaccination vacination) {
        this.vacination = vacination;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getProducedReceivedQuantity() {
        return producedReceivedQuantity;
    }

    public void setProducedReceivedQuantity(int producedReceivedQuantity) {
        this.producedReceivedQuantity = producedReceivedQuantity;
    }
    
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
