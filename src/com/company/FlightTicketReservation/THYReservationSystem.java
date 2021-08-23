package com.company.FlightTicketReservation;

public class THYReservationSystem extends FlightReservationSystem {


    //Bilet türünü ve koltuk seçimini yaptığımız method
    public THYReservationSystem() {

        System.out.println("Welcome to THY Reservation System ");

        System.out.println("For Business Class ticket press 0, for Economy Class Ticket press 1: ");

        int ticketChoose = scanner.nextInt();

        if (ticketChoose!=0 && ticketChoose!=1)
        {
            System.out.println("Wrong choice");
        }
        if (ticketChoose==0) {
            seatListBusiness();
            System.out.println("Seat number " + seatChosenB + " has been reserved for you! \n Have a nice flight! " );
        }
        else if(ticketChoose==1) {
            seatListEconomy();
            System.out.println("Seat number " + seatChosenE + " has been reserved for you! \n Have a nice flight! " );
        }

       //int seatEconomyChoice = scanner.nextInt();
        }




    // Base class'dan erişim sağlayarak koltuk sayısını kullanıcıdan aldığımız method
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

    public THYReservationSystem(int numberOfSeat) {
        setNumberOfSeat(numberOfSeat);
    }


    @Override
    public void getReservation() {
        super.getReservation();
    }


}