package com.company.FlightTicketReservation;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static boolean exit;
    private static int companyChoose;
    private static int numberOfSeat = 0;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to ticket system");


        System.out.println("Choose THY:0 or Pegasus:1");
        companyChoose = scanner.nextInt();

        if (companyChoose==0){
            THYReservationSystem thyReservationSystem = new THYReservationSystem(numberOfSeat);

        }
        else if(companyChoose==1){
            PegasusReservationSystem pegasusReservationSystem = new PegasusReservationSystem(numberOfSeat);
        }

        chooseCompany();

        FlightReservationSystem reservation = new FlightReservationSystem() {

            @Override
            public void getReservation() {
            }
        };

        reservation.setNumberOfSeat(reservation.getNumberOfSeat());


    }

    private static void chooseCompany() {
        Scanner scanner = new Scanner(System.in);


        if (exit==false){

            switch (companyChoose) {
                case 0:
                    FlightReservationSystem thy = new THYReservationSystem();
                    
                    break;
                case 1:
                    FlightReservationSystem pegasus = new PegasusReservationSystem();
                   
                    break;
                default:
                    System.out.println("Have a nice day!");
            }

            System.out.println("If u want exit press e, for continue press c");
            String exitS = scanner.next();
            if (exitS.equals("e"))
                exit = true;
            if (exitS.equals("c"))
                chooseCompany();
        }
        else if (exit)
            System.out.println("Have a nice day!");

    }

}


