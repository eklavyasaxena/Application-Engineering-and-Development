/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03;

import java.time.LocalDate;

/**
 *
 * @author fanzhonghao
 */
public class Flight {
    private Airplane airplane;
    private Seat[] seats;
    private String destination;
    private LocalDate date;
    private int price;
    
    public Flight(Airplane a, String d, String ld, int p) {
        airplane = a;
        seats = new Seat[150];
        for (int i = 0; i < 150; i++) {
            seats[i] = new Seat();
        }
        destination = d;
        date = LocalDate.parse(ld, LocalDateHelper.dateFormatter);
        price = p;
    }
    
    public Seat getSeat(int row, int column) {
        return seats[6 * row + column];
    }
    
    public Seat getSeat(int i) {
        return seats[i];
    }
        
    public int getRevenue() {
        int revenue = 0;
        for (int i = 0; i < 150; i++) {
            if (getSeat(i).isBooked()) {
                revenue += price;
            }
        }
        return revenue;
    }
    
    public void showMap() {
        System.out.println("\tW M A || A M W");
        System.out.println("\t______________");
        
        for(int i = 0; i < 25; i ++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(seats[6 * i + j]);
                System.out.print(" ");
            }
            System.out.print("|| ");
            for (int j = 3; j < 6; j++) {
                System.out.print(seats[6 * i + j]);
                System.out.print(" ");
            }
            System.out.print("\n");
            
            System.out.println();
        }
    }
    
    public String toString() {
        return "Airplane: " + airplane + "\t Destination: " + destination + "\t Date: " + date.format(LocalDateHelper.dateFormatter) + "\t Price: " + price + "\t Revenue: " + getRevenue();
    }
}
