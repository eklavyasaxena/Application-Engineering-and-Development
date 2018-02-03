/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fanzhonghao
 */
public class HW03 {

    /**
     * @param args the command line arguments
     */
    private TravelAgency ta;
    private Scanner in = new Scanner(System.in);
    private String input;
    public static void main(String[] args) {
        // TODO code application logic here
        HW03 hw = new HW03();
        System.out.println("Welcome to Zhonghao's Travel Data Management System!\nType \"HELP\" for list of commands and \"QUIT\" for exit (Case Sensitive!)\n");
        
        
        while (!(hw.input = hw.in.nextLine()).equals("QUIT")) {
            hw.checkInput();
        }
        
        
        //hw.generateData(hw.ta);
    }
    
    public void checkInput() {
        if (input.equals("HELP")) {
            System.out.println("HELP - this article");
            System.out.println("LOAD - read previous data");
            System.out.println("VIEW_ALL_AIRLINERS - get the list of all Airliners and the total Revenue of them");
            System.out.println("VIEW_AIRLINER - get the list of all Flights and the total Revenue of them");
            System.out.println("QUIT - exit");
            System.out.println();
        } else if (input.equals("LOAD")) {
            generateData();
            System.out.println();
        } else if (input.equals("VIEW_ALL_AIRLINERS")) {
            if (ta == null) {
                System.out.println("No data exists.  Type \"LOAD\" to get data first\n");
            } else {
                int index = 0;
                for (Airliner a : ta.getAirliners()) {
                    System.out.println("Airliner[" + index + "] " + a.getName() + " has revenue of $" + a.getRevenue() + ".");
                    index++;
                }
                System.out.println("-------------------------------------------");
                System.out.println("Total revenue of the above Airliners are $" + ta.getRevenue());
                System.out.println("You may enter \"VIEW_AIRLINER\" to view details for selected Airliner\n");
            }
        } else if (input.equals("VIEW_AIRLINER")) {
            String subInput;
            if (ta == null) {
                System.out.println("No data exists.  Type \"LOAD\" to get data first\n");
            } else {
                int size = ta.getAirliners().size();
                System.out.println("There are " + size + " airliners, please enter a valid index to drill-down.\n");
                while(!(subInput = in.nextLine()).equals("RETURN")) {
                    int subIndex = -1;
                    try {
                        subIndex = Integer.parseInt(subInput);
                    } catch (Exception ex) {
                        System.out.println("Invalid input!  Please enter a valid index!\n");
                    }
                    if (subIndex < 0 || subIndex >= size) {
                        System.out.println("The index is out of scope!  Enter an integer between 0 and " + (size - 1) + " !\nTo return to upper level, please type \"RETURN\"\n");
                    } else {
                        System.out.println("Airliner[" + subIndex + "] selected.");
                        int index = 0;
                        for (Flight f : ta.getAirliners().get(subIndex).getFs().getFlights()) {
                            System.out.println("Flight[" + index + "] \t" + f);
                            index++;
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("Airliner[" + subInput + "] " + ta.getAirliners().get(subIndex).getName() + " has revenue of $" + ta.getAirliners().get(subIndex).getRevenue() + ".");
                        System.out.println("You may enter \"VIEW_FLIGHT\" to view details for selected FLIGHT or type \"RETURN\" to go to Airliner selection.\n");
                        
                        int sizeFlight = ta.getAirliners().get(subIndex).getFs().getFlights().size();
                        while (!(subInput = in.nextLine()).equals("RETURN")) {
                            if (subInput.equals("VIEW_FLIGHT")) {
                                System.out.println("There are " + sizeFlight + " airliners, please enter a valid index to drill-down.\n");
                                while(!(subInput = in.nextLine()).equals("RETURN")) {
                                    int subSubIndex = -1;
                                    try {
                                        subSubIndex = Integer.parseInt(subInput);
                                    } catch (Exception ex) {
                                        System.out.println("Invalid input!  Please enter a valid index!\n");
                                    }
                                    if (subSubIndex < 0 || subSubIndex >= sizeFlight) {
                                        System.out.println("The index is out of scope!  Enter an integer between 0 and " + (sizeFlight - 1) + " !\nTo return to upper level, please type \"RETURN\"\n");
                                    } else {
                                        System.out.println("Flight[" + subSubIndex + "] selected.");
                                        ta.getAirliners().get(subIndex).getFs().getFlights().get(subSubIndex).showMap();
                                        System.out.println("-------------------------------------------");
                                        System.out.println(ta.getAirliners().get(subIndex).getFs().getFlights().get(subSubIndex));
                                        System.out.println("You may enter \"VIEW_FLIGHT\" to view details for selected FLIGHT or type \"RETURN\" to go to Airliner selection.\n");
                                        System.out.println();
                                    }
                                }
                            } else {
                                System.out.println("You may enter \"VIEW_FLIGHT\" to view details for selected FLIGHT or type \"RETURN\" to go to Airliner selection.\n");
                            }
                        }
                    }
                }
                
                //if (subInput == )
//                int index = 0;
//                for (Airliner a : ta.getAirliners()) {
//                    System.out.println("Airliner[" + index + "] " + a.getName() + " has revenue of $" + a.getRevenue() + ".");
//                }
//                System.out.println();
            }
        } else {
            System.out.println("Wrong Command!  Type \"HELP\" for list of commands and \"QUIT\" for exit (Case Sensitive!)\n");
        }
    }
    
    public void generateData() {
        ta = new TravelAgency();
        Random rnd = new Random();
        
        Airliner jal = new Airliner("JAL");
        Airliner qtr = new Airliner("QTR");
        Airliner dlh = new Airliner("DLH");
        
        ta.getAirliners().add(jal);
        ta.getAirliners().add(qtr);
        ta.getAirliners().add(dlh);
        
        Airplane jal1 = new Airplane("Boeing-737");
        Airplane jal2 = new Airplane("Boeing-747");
        Airplane qtr1 = new Airplane("Airbus-300");
        Airplane qtr2 = new Airplane("Airbus-310");
        Airplane dlh1 = new Airplane("Airbus-330");
        Airplane dlh2 = new Airplane("Boeing-777");
        
        jal.getAirplanes().add(jal1);
        jal.getAirplanes().add(jal2);
        qtr.getAirplanes().add(qtr1);
        qtr.getAirplanes().add(qtr2);
        dlh.getAirplanes().add(dlh1);
        dlh.getAirplanes().add(dlh2);
        
        Flight jal1_1 = new Flight(jal1, "Rome", "09/30/2017", rnd.nextInt(900) + 100);
        Flight jal1_2 = new Flight(jal1, "Boston", "10/01/2017", rnd.nextInt(900) + 100);
        Flight jal2_1 = new Flight(jal2, "Mumbai", "09/30/2017", rnd.nextInt(900) + 100);
        Flight jal2_2 = new Flight(jal2, "Paris", "10/01/2017", rnd.nextInt(900) + 100);
        Flight qtr1_1 = new Flight(qtr1, "Boston", "09/30/2017", rnd.nextInt(900) + 100);
        Flight qtr1_2 = new Flight(qtr1, "New Delhi", "10/01/2017", rnd.nextInt(900) + 100);
        Flight qtr2_1 = new Flight(qtr2, "Tokyo", "09/30/2017", rnd.nextInt(900) + 100);
        Flight qtr2_2 = new Flight(qtr2, "Mumbai", "10/01/2017", rnd.nextInt(900) + 100);
        Flight dlh1_1 = new Flight(dlh1, "New Delhi", "09/30/2017", rnd.nextInt(900) + 100);
        Flight dlh1_2 = new Flight(dlh1, "Rome", "10/01/2017", rnd.nextInt(900) + 100);
        Flight dlh2_1 = new Flight(dlh2, "Paris", "09/30/2017", rnd.nextInt(900) + 100);
        Flight dlh2_2 = new Flight(dlh2, "Tokyo", "10/01/2017", rnd.nextInt(900) + 100);
        
        jal.getFs().getFlights().add(jal1_1);
        jal.getFs().getFlights().add(jal1_2);
        jal.getFs().getFlights().add(jal2_1);
        jal.getFs().getFlights().add(jal2_2);
        qtr.getFs().getFlights().add(qtr1_1);
        qtr.getFs().getFlights().add(qtr1_2);
        qtr.getFs().getFlights().add(qtr2_1);
        qtr.getFs().getFlights().add(qtr2_2);
        dlh.getFs().getFlights().add(dlh1_1);
        dlh.getFs().getFlights().add(dlh1_2);
        dlh.getFs().getFlights().add(dlh2_1);
        dlh.getFs().getFlights().add(dlh2_2);
        
        int rndCustomer = -1;
        int rndSeat;
        String[] destinations = {"Rome", "Boston", "Mumbai", "Paris", "Boston", "New Delhi", "Tokyo", "Mumbai", "New Delhi", "Rome", "Paris", "Tokyo"};
        String[] dates = {"09/30/2017", "10/01/2017"};
        Flight[] flights = {jal1_1, jal1_2, jal2_1, jal2_2, qtr1_1, qtr1_2, qtr2_1, qtr2_2, dlh1_1, dlh1_2, dlh2_1, dlh2_2};
        
        for (int i = 0; i < 12; i++) {
            rndCustomer += 1 + rnd.nextInt(10);
            rndSeat = -1;
            while (rndSeat < 148) {
                rndCustomer = rndCustomer + 1 + rnd.nextInt(2);
                rndSeat = rndSeat + 1 + rnd.nextInt(2);
                Customer customer = new Customer(rndCustomer, destinations[i], dates[i % 2]);
                customer.book(flights[i].getSeat(rndSeat));
                ta.getCd().add(customer);
            }
        }
        
        ArrayList<Integer> assignedCustomers = new ArrayList<>();
        for (int i = 0; i < ta.getCd().getCustomers().size(); i++) {
            assignedCustomers.add(ta.getCd().getCustomers().get(i).getName());
        }
        
        for (int i = 0; i < 2100; i++) {
            if (!assignedCustomers.contains(i)) {
                Customer customer = new Customer(i, destinations[rnd.nextInt(12)], dates[rnd.nextInt(2)]);
                ta.getCd().add(customer);
            }
        }
        
        System.out.println("Data loaded successfully!");
        
//        System.out.println(ta.getCd().getCustomers().size());
//
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(0).getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(0).getFs().getFlights().get(0).getRevenue());
//        System.out.println(ta.getAirliners().get(0).getFs().getFlights().get(1).getRevenue());
//        System.out.println(ta.getAirliners().get(0).getFs().getFlights().get(2).getRevenue());
//        System.out.println(ta.getAirliners().get(0).getFs().getFlights().get(3).getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(1).getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(1).getFs().getFlights().get(0).getRevenue());
//        System.out.println(ta.getAirliners().get(1).getFs().getFlights().get(1).getRevenue());
//        System.out.println(ta.getAirliners().get(1).getFs().getFlights().get(2).getRevenue());
//        System.out.println(ta.getAirliners().get(1).getFs().getFlights().get(3).getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(2).getRevenue());
//        System.out.println("------------------------------------------------");
//        System.out.println(ta.getAirliners().get(2).getFs().getFlights().get(0).getRevenue());
//        System.out.println(ta.getAirliners().get(2).getFs().getFlights().get(1).getRevenue());
//        System.out.println(ta.getAirliners().get(2).getFs().getFlights().get(2).getRevenue());
//        System.out.println(ta.getAirliners().get(2).getFs().getFlights().get(3).getRevenue());
//        System.out.println("------------------------------------------------");
//        
    }
}
