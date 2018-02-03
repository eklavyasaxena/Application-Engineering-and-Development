/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Market;

import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class MarketCatalog {
    ArrayList<Market> marketList;
    
    public MarketCatalog(){
        this.marketList=new ArrayList<>();
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public Market addMarket(){
            Market market = new Market();
            marketList.add(market);
            return market;
        }

    public void deleteMarket(Market market){
            marketList.remove(market);
    }

    public Market searchMarket(String marketID){
        for (Market market : marketList) {
            if(market.getMarketId().equals(marketID)){
                return market;
            }
        }
        return null;
    }
    
    
}
