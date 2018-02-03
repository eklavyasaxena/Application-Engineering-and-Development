/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Network.Network;
import java.sql.Time;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author eklav
 */
public class ChildPortfolio {
    
    private int childID;
    private static int count = 1;
    
    private String childName;
    private Person mother;
    private Person father;
    private Date dateOfBirth;
    
    private Network network;
    private VaccineHistoryCard vaccineHistoryCard;
    
    private ImageIcon image;
    
    public ChildPortfolio(){
        mother = new Person();
        father = new Person();
        dateOfBirth = new Date();
        
        network = new Network();
        vaccineHistoryCard = new VaccineHistoryCard();
        
        image = new ImageIcon();
        
        childID = count;
        count++;
    }

    public int getChildID() {
        return childID;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    

    public Person getMother() {
        return mother;
    }
    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }
    public void setFather(Person father) {
        this.father = father;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Network getNetwork() {
        return network;
    }
    public void setNetwork(Network network) {
        this.network = network;
    }

    public VaccineHistoryCard getVaccineHistoryCard() {
        return vaccineHistoryCard;
    }

    public void setVaccineHistoryCard(VaccineHistoryCard vaccineHistoryCard) {
        this.vaccineHistoryCard = vaccineHistoryCard;
    }
    
}
