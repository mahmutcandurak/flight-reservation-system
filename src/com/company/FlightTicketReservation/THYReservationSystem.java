package com.company.FlightTicketReservation;

import java.util.List;

public class THYReservationSystem extends FlightReservationSystem {




    public THYReservationSystem() {

        }

    public THYReservationSystem(int numberOfSeat) {
        setNumberOfSeat(numberOfSeat);
    }

    //Bilet turunu sectigimiz kullanıcıya bilgi verdigimiz method
    public void reservation(List<Integer> businessSeats, List<Integer> economySeats) {
            System.out.println("Welcome to THY Reservation System ");

            System.out.println("For Business Class ticket press 0, for Economy Class Ticket press 1: ");

            int ticketChoose = scanner.nextInt();

            if (ticketChoose!=0 && ticketChoose!=1)
            {
                System.out.println("Wrong choice");
            }
            if (ticketChoose==0) {
                seatListBusiness(businessSeats);
                System.out.println("Seat number " + seatChosenB + " has been reserved for you! \n Have a nice flight! " );
                if (businessSeats.size()==0){
                    isBusinessEmpty(businessSeats);
                }
            }
            else if(ticketChoose==1) {
                seatListEconomy(economySeats);
                System.out.println("Seat number " + seatChosenE + " has been reserved for you! \n Have a nice flight! " );
                if (economySeats.size()==0){
                    isEconomyEmpty(economySeats);
                }
            }

        }

    @Override
    protected void chooseCompany(List<Integer> businessSeats, List<Integer> economySeats) {

    }

    @Override
    protected void chooseCompany(List<Integer> businessSeats) {

    }

    // Base class'dan erisim saglayarak koltuk sayisini kullanicidan aldigimiz method
    @Override
    public boolean setNumberOfSeat(int numberOfSeat) {
        System.out.println("Please enter number of seat");

        int seatNumberChoose = scanner.nextInt();

        if (seatNumberChoose<10) {
            System.out.println("Seat number is wrong. Assigned as number 10 ");
            numberOfSeat=10;
        }
        else
            numberOfSeat=seatNumberChoose;

        this.numberOfSeat = numberOfSeat;

        System.out.println("Number of seat: " + numberOfSeat);
        setSeatCount(numberOfSeat);
        super.setNumberOfSeat(numberOfSeat);

        return false;
    }



    @Override
    public void getReservation() {
        super.getReservation();
    }


}