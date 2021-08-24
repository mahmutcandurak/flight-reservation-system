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


    public static void flightReservationSystem() {


    }

    public static void flightReservationSystem(int numberOfSeat) {

    }


    public static int[] getSetSeats() {
        return setSeats;
    }

    //Business koltuklar icin kullaniciya bilet secimi yaptırdıgımız method
    public void seatListBusiness(List<Integer> businessSeats) {

        System.out.println("Choose your seat:");
        System.out.println(businessSeats);

        seatChosenB = scanner.nextInt();
        int listSize = businessSeats.size();

        for(int i = 0; i < listSize; i++) {
            businessSeats.removeAll(Arrays.asList(seatChosenB));
        }
    }




    //Ekonomi koltuklar icin kullaniciya bilet secimi yaptırdıgımız method
    public void seatListEconomy(List<Integer> economySeats) {
        {

            System.out.println("Choose your seat:");
            System.out.println(economySeats);
            seatChosenE = scanner.nextInt();
            int listSize = economySeats.size();

            for(int i = 0; i < listSize; i++) {
                economySeats.removeAll(Arrays.asList(seatChosenE));
            }
        }
    }

    //Pegasusa ait ekonomi sinifinda random bilet ureten method
    public void seatListRandom(List<Integer> economySeats) {
        Random random = new Random();
        int randomSeat=economySeats.get(random.nextInt(economySeats.size()));

        int listSize = economySeats.size();
        for(int i = 0; i < listSize; i++) {
            economySeats.removeAll(Arrays.asList(randomSeat));
        }
        System.out.println("Seat number " + randomSeat + " has been reserved for you! \n Have a nice flight! " );
        if (economySeats.size()==0){
            isEconomyEmpty(economySeats);
        }
    }



    public void setSeatCount(int numberOfSeat) {
        this.seats = new boolean[this.numberOfSeat];
    }



    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    protected abstract void chooseCompany(List<Integer> businessSeats, List<Integer> economySeats);

    protected abstract void chooseCompany(List<Integer> businessSeats);

    public boolean setNumberOfSeat(int numberOfSeat) {
        return true;
    }

    //Ekonomi biletleri tukendiginde kullaniciya mesaj gecen method
    public boolean isEconomyEmpty(List<Integer> economySeats) {
        System.out.println("\n We don't have any economy tickets, sorry !");
        return true;
    }

    //Business biletleri tukendiginde kullaniciya mesaj gecen method
    public boolean isBusinessEmpty(List<Integer> businessSeats) {
        System.out.println("\n We don't have any business tickets, sorry !");
        return true;
    }


    public void getReservation() {

    }

}

