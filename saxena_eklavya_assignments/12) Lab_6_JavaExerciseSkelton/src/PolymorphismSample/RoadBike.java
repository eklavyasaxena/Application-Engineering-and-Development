/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismSample;

/**
 *
 * @author User
 */
public class RoadBike extends Bicycle {

    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
        super(startCadence, startSpeed, startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike" + " has " + getTireWidth()
                + " MM tires.");
    }
}
