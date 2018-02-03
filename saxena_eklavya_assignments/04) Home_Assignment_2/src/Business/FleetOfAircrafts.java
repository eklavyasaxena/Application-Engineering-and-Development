/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eklav
 */
public class FleetOfAircrafts {
    private ArrayList<Aircraft> fleet;
    
    public FleetOfAircrafts(){
        fleet = new ArrayList<Aircraft>();
    }

    public ArrayList<Aircraft> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Aircraft> fleet) {
        this.fleet = fleet;
    }
    
    public Aircraft addAircraft(){
        Aircraft newAircraft = new Aircraft();
        fleet.add(newAircraft);
        return newAircraft;
    }

    public void deleteAircraft(Aircraft delAircraft){
        fleet.remove(delAircraft);
    }
    
    public void updateAircraft(int selectedPos, Aircraft updAircraft){
        fleet.set(selectedPos, updAircraft);
    }
    
    public FleetOfAircrafts searchAllAircraft(String manufacturer, String serialNum, String maintCertificate, String modelNum, String yearOfManufacturer,
                                    String airportLocated, String deptTime, String seatAvailable){
        
        
        Iterator<Aircraft> iterates = fleet.iterator();
        
        if(!manufacturer.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if(!manufacturer.equals(nextAircraft.getMakeOfAircraft())){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!serialNum.isEmpty()){
            while(iterates.hasNext()){
                System.out.println(serialNum);
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if((nextAircraft.getSerialNum())!=(Integer.parseInt(serialNum))){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!maintCertificate.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if(!maintCertificate.equals(nextAircraft.getMaintCertification())){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!modelNum.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if((nextAircraft.getModelNum())!=(Integer.parseInt(modelNum))){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!yearOfManufacturer.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if((nextAircraft.getMakeYear())!=(Integer.parseInt(yearOfManufacturer))){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!airportLocated.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if(!airportLocated.equals(nextAircraft.getAirport())){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!deptTime.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if(!deptTime.equals(nextAircraft.getDepartTime())){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        if(!seatAvailable.isEmpty()){
            while(iterates.hasNext()){
                Aircraft nextAircraft = iterates.next();//finds and returns the next complete token from this scanner
                if((nextAircraft.getNumOfSeats())!=(Integer.parseInt(seatAvailable))){
                    //method determines whether the Number object that invokes the method is equal to the object that is passed as an argument.
                    iterates.remove();
                }
            }
        }
        System.out.println(iterates);
       return this;
    }
}
