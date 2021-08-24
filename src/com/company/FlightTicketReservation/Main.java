package com.company.FlightTicketReservation;

import java.util.*;

public class Main {

    private static boolean exit;
    private static int companyChoose;
    private static int numberOfSeat = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> businessSeats = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> economySeats = new ArrayList<>(Arrays.asList(6,7,8,9,10));

        System.out.println("Welcome to ticket system");


        System.out.println("Choose THY:0 or Pegasus:1");
        companyChoose = scanner.nextInt();
        chooseCompany(businessSeats, economySeats);

        FlightReservationSystem reservation = new FlightReservationSystem() {

            @Override
            protected void chooseCompany(List<Integer> businessSeats, List<Integer> economySeats) {

            }

            @Override
            protected void chooseCompany(List<Integer> businessSeats) {

            }

            @Override
            public void getReservation() {
            }
        };

        reservation.setNumberOfSeat(reservation.getNumberOfSeat());


    }

    //Kullanıcıya sirket secimi yaptıran method
    private static void chooseCompany(List<Integer> businessSeats, List<Integer> economySeats) {
        Scanner scanner = new Scanner(System.in);


        if (exit==false){

            switch (companyChoose) {
                case 0:
                    THYReservationSystem thy = new THYReservationSystem();
                    thy.reservation(businessSeats,economySeats);
                    
                    break;
                case 1:
                    PegasusReservationSystem pegasus = new PegasusReservationSystem();
                    pegasus.reservation(businessSeats,economySeats);
                   
                    break;
                default:
                    System.out.println("Wrong choice please enter 0 or 1 !!");

            }

            System.out.println("If u want exit press e, for continue press c");
            String exitS = scanner.next();
            if (exitS.equals("e")){
                System.out.println("Have a nice day!!");
                exit = true;
            }
                            if (exitS.equals("c")){
                if (businessSeats.size()==0 && economySeats.size()==0){
                    isAeroplaneEmpty(businessSeats,economySeats);
                }
                else
                chooseCompany(businessSeats, economySeats);
            }
        }
        else if (exit){
            System.out.println("Have a nice day!");
        }

    }

    //Ucakta bilet kalmadığında kullanıcıya uyarı gecen method
    private static void isAeroplaneEmpty(List<Integer> businessSeats, List<Integer> economySeats) {
        System.out.println("Aeroplane is full. Have a nice day!!");
    }
}


