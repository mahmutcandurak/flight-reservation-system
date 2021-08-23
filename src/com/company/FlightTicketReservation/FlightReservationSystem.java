package com.company.FlightTicketReservation;

import java.util.*;

public abstract class FlightReservationSystem {




    protected int seatCount;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public static boolean[] seats;
    public static int numberOfSeat;
    public static int[] setSeats;


    public static int seatChosenB;
    public static int seatChosenE;

    public static int[] getSetSeats() {
        return setSeats;
    }

    public void seatListBusiness() {
        List seatListB = new ArrayList<Integer>();
        System.out.println("Choose your seat:");

        for (int i=1; i<=5; i++){
            seatListB.add(i);
            for (int j=0; j<=seatListB.size()-1;j++){
                seatListB.remove((Integer)seatChosenB);
           }
        }

        if (seatListB.size()==0)
            System.out.println("We don't have business ticket! Sorry!!");

        System.out.println(seatListB);
        seatChosenB = scanner.nextInt();

    }


    public void seatListEconomy() {
        List seatListE = new ArrayList<Integer>();

        System.out.println("Choose your seat:");
        for (int i = 6; i <= 10; i++) {
            seatListE.add(i);
            for (int j=0; j<=seatListE.size()-1; j++){
                seatListE.remove((Integer)seatChosenE);
            }
        }
        System.out.println(seatListE);
        seatChosenE = scanner.nextInt();

    }

    public void setSeatCount(int numberOfSeat) {
        this.seats = new boolean[this.numberOfSeat];
    }



    public static void flightReservationSystem() {


    }

    public static void flightReservationSystem(int numberOfSeat) {

    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public boolean setNumberOfSeat(int numberOfSeat) {
        return true;
    }


    public boolean isEconomyEmpty() {
        return true;
    }

    public boolean isBusinessEmpty() {
        return true;
    }


    public void isAeroplaneEmpty() {

    }

    public void getReservation() {

    }







}
