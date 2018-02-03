/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MarketOffers;

import Business.Market.Market;
import java.util.ArrayList;

/**
 *
 * @author sachinsenthilkumar
 */
public class MarketOfferCatalog {
    ArrayList<MarketOffer> marketOfferList;
    
    public MarketOfferCatalog(){
        this.marketOfferList=new ArrayList<>();
    }

    public ArrayList<MarketOffer> getMarketOfferList() {
        return marketOfferList;
    }

    public MarketOffer addMarketOffer(){
        MarketOffer marketoffer = new MarketOffer();
        marketOfferList.add(marketoffer);
        return marketoffer;
    }
    
    public MarketOffer searchMarket(Market market){
        for(MarketOffer marketOffer : marketOfferList){
            if(market.getMarketId().equals(marketOffer.getMarket().getMarketId())){
                return marketOffer;
            }
        }
        return null;
    }

    public void deleteMarketOffer(MarketOffer marketoffer){
            marketOfferList.remove(marketoffer);
    }
}
    
    
    
    

