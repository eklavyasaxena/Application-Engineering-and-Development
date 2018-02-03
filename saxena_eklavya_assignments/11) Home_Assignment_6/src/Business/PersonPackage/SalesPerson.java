/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PersonPackage;

/**
 *
 * @author eklav
 */
public class SalesPerson {
    
double totalRevenueBySalesPerson;
double totalTargetForSalesPerson;
double totalCostPriceForSalesPerson;
int totalOrdersBooked;
int totalAboveTarget;
int totalBelowTarget;

Person person;

    public double getTotalRevenueBySalesPerson() {
        return totalRevenueBySalesPerson;
    }

    public void setTotalRevenueBySalesPerson(double totalRevenueBySalesPerson) {
        this.totalRevenueBySalesPerson = totalRevenueBySalesPerson;
    }

    public double getTotalTargetForSalesPerson() {
        return totalTargetForSalesPerson;
    }

    public void setTotalTargetForSalesPerson(double totalTargetForSalesPerson) {
        this.totalTargetForSalesPerson = totalTargetForSalesPerson;
    }

    public double getTotalCostPriceForSalesPerson() {
        return totalCostPriceForSalesPerson;
    }

    public void setTotalCostPriceForSalesPerson(double totalCostPriceForSalesPerson) {
        this.totalCostPriceForSalesPerson = totalCostPriceForSalesPerson;
    }

    public int getTotalOrdersBooked() {
        return totalOrdersBooked;
    }

    public void setTotalOrdersBooked(int totalOrdersBooked) {
        this.totalOrdersBooked = totalOrdersBooked;
    }

    public int getTotalAboveTarget() {
        return totalAboveTarget;
    }

    public void setTotalAboveTarget(int totalAboveTarget) {
        this.totalAboveTarget = totalAboveTarget;
    }

    public int getTotalBelowTarget() {
        return totalBelowTarget;
    }

    public void setTotalBelowTarget(int totalBelowTarget) {
        this.totalBelowTarget = totalBelowTarget;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    
}
