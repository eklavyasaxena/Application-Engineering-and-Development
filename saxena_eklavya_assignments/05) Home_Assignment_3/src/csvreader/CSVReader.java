/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvreader;

import Business.AirlinersDirectory.Airliner;
import Business.AirlinersDirectory.AirlinersDirectory;
import Business.Booking;
import Business.BookingLog;
import Business.CustomerDirectory.Customer;
import Business.CustomerDirectory.CustomerDirectory;
import Business.MasterTravelSchedule.FlightSchedule.Flight;
import Business.MasterTravelSchedule.FlightSchedule.FlightSchedule;
import Business.MasterTravelSchedule.FlightSchedule.BunchOfSeats.Seat;
import Business.MasterTravelSchedule.FlightSchedule.BunchOfSeats.BunchOfSeats;
import com.sun.org.apache.xalan.internal.xsltc.compiler.NodeTest;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CSVReader {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        
        String csvSeat = "seat_data.csv";
        BunchOfSeats seatList = new BunchOfSeats();
        try {
            br = new BufferedReader(new FileReader(csvSeat));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] seatElement = line.split(csvSplitBy);
                
                Seat seat = seatList.addSeat();
                String seatNum = seatElement[0];
                double seatPrice = Double.parseDouble(seatElement[1]);
                
                seat.setSeatNum(seatNum);
                seat.setSeatPrice(seatPrice);
            }
            int i=1;
            for(Seat a : seatList.getSeatList()){
                System.out.println(i+":SeatNum-->"+a.getSeatNum()+"\tSeatPrice-->"+a.getSeatPrice());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n");
        
        
        
        String csvFlight = "flight_data.csv";
        FlightSchedule flightList = new FlightSchedule();
        try {
            br = new BufferedReader(new FileReader(csvFlight));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] flightElement = line.split(csvSplitBy);
                
                Flight flight = flightList.addFlight();
                String flightNum = flightElement[0];
                String origin = flightElement[1];
                String destination = flightElement[2];
                
                flight.setFlightNum(flightNum);
                flight.setOrigin(origin);
                flight.setDestination(destination);
                flight.setSeatsInFlight(seatList);
            }
            int i=1;
            for(Flight a : flightList.getFlightList()){
                System.out.println(i+":FlightNum-->"+a.getFlightNum()+"\tFlightOrigin-->"+a.getOrigin()
                    +"\tFlightDestination-->"+a.getDestination());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n");
        
        
        
        String csvAirliner = "airliner_data.csv";
        AirlinersDirectory airlinerList = new AirlinersDirectory();
        try {
            br = new BufferedReader(new FileReader(csvAirliner));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] airlinerElement = line.split(csvSplitBy);
                
                Airliner airliner = airlinerList.addAirliner();
                String airlinerID = airlinerElement[0];
                String airlinerName = airlinerElement[1];
                
                airliner.setAirlinerID(airlinerID);
                airliner.setAirlinerName(airlinerName);
                airliner.setFlightsch(flightList);
            }
            int i=1;
            for(Airliner a : airlinerList.getAirlinerList()){
                System.out.println(i+":AirlinerID-->"+a.getAirlinerID()+"\tAirlinerName-->"+a.getAirlinerName());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n");
        
        
        
        String csvCustomer = "customer_data.csv";
        CustomerDirectory customerList = new CustomerDirectory();
        try {
            br = new BufferedReader(new FileReader(csvCustomer));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] customerElement = line.split(csvSplitBy);
                
                Customer customer = customerList.addCustomer();
                int customerUID = Integer.parseInt(customerElement[0]);
                String customerName = customerElement[1];
                String customerEmail = customerElement[2];
                
                customer.setCustomerUID(customerUID);
                customer.setCustomerName(customerName);
                customer.setCustomerEmailID(customerEmail);
            }
            int i=1;
            for(Customer a : customerList.getCustomerList()){
                System.out.println(i+":CustomerUID-->"+a.getCustomerUID()+"\tCustomerName-->"+a.getCustomerName()
                    +"\tCustomerEmailID-->"+a.getCustomerEmailID());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n");
        
        
        
        String csvBooking = "booking_data.csv";
        BookingLog bookingList = new BookingLog();
        try {
            br = new BufferedReader(new FileReader(csvBooking));
            while ((line = br.readLine()) != null){
                // use comma as separator
                String[] bookingElement = line.split(csvSplitBy);
                
                Booking booking = bookingList.addBooking();
                String bookingNum = bookingElement[0];
                String airlinerID = bookingElement[1];
                String flightNum = bookingElement[2];
                int customerUID = Integer.parseInt(bookingElement[3]);
                String seatNum = bookingElement[4];
                String airplaneID = bookingElement[5];
                
                booking.setBookingID(bookingNum);
                booking.setAirlinerID(airlinerID);
                booking.setFlightNum(flightNum);
                booking.setCustomerUID(customerUID);
                booking.setSeatNum(seatNum);
                booking.setAirplaneID(airplaneID);
            }
            int i=1;
            for(Booking a : bookingList.getBookingList()){
                System.out.println(i+":BookingID-->"+a.getBookingID()+"\tAirlinerID-->"+a.getAirlinerID()
                    +"\tFlightNum-->"+a.getFlightNum()+"\tCustomerUID-->"+a.getCustomerUID()
                    +"\tSeatNum-->"+a.getSeatNum());
                i++;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\n");
        
        
        
        double price;
        
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("UK".compareTo(a.getAirlinerID())==0){
                
                
               price += airlinerList.searchAirliner(a.getAirlinerID()).searchAirplane(a.getFlightNum()).getSeatPrice(a.getSeatNum());

                
            }
        }
        System.out.println("The Total Revenue of Vistara = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("9W".compareTo(a.getAirlinerID())==0){
                
                
               price += airlinerList.searchAirliner(a.getAirlinerID()).searchAirplane(a.getFlightNum()).getSeatPrice(a.getSeatNum());

                
            }
        }
        System.out.println("The Total Revenue of JetAirways = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("AI".compareTo(a.getAirlinerID())==0){
                
                
               price += airlinerList.searchAirliner(a.getAirlinerID()).searchAirplane(a.getFlightNum()).getSeatPrice(a.getSeatNum());

                
            }
        }
        System.out.println("The Total Revenue of AirIndia = $"+price);
        System.out.println("\n");
        
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("UK-3672".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of UK-3672 = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("9W-4583".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of 9W-4583 = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("AI-2069".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of AI-2069 = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("UK-9923".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of UK-9923 = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("9W-9367".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of 9W-9367 = $"+price);
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
            if("AI-3498".compareTo(a.getFlightNum())==0){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
            }
        }
        System.out.println("The Total Revenue of AI-3498 = $"+price);
        System.out.println("\n");
        
        
        price = 0;
        for(Booking a : bookingList.getBookingList()){
                
               price += flightList.searchFlight(a.getFlightNum()).getSeatPrice(a.getSeatNum());
                
        }
        System.out.println("The Total Revenue of All Flights = $"+price);
    }
}
