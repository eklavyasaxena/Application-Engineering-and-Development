/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MarketOffers;

import Business.Market.Market;

/**
 *
 * @author sachinsenthilkumar
 */
public class MarketOffer {
    double targetPercentage;
    double floorPercentage;
    double ceilingPercentage;
    Market market;
    
    public MarketOffer(){
        market = new Market();
    }

    public double getTargetPercentage() {
        return targetPercentage;
    }

    public void setTargetPercentage(double targetPercentage) {
        this.targetPercentage = targetPercentage;
    }

    public double getFloorPercentage() {
        return floorPercentage;
    }

    public void setFloorPercentage(double floorPercentage) {
        this.floorPercentage = floorPercentage;
    }

    public double getCeilingPercentage() {
        return ceilingPercentage;
    }

    public void setCeilingPercentage(double ceilingPercentage) {
        this.ceilingPercentage = ceilingPercentage;
    }

    
    
    

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
    
    
    
}
