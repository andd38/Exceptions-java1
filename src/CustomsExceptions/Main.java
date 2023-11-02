package CustomsExceptions;

import CustomsExceptions.modelEntities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Room number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(sc.next());
        if(!checkout.after(checkin)){
            System.out.println("Error in reservation : ckeck-out date must be after checkin date");
        } else {
            Reservation reservation = new Reservation(number,checkin,checkout);
            System.out.println("Reservation "+ reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            Date now = new Date();


              String error =  reservation.updateDates(checkin,checkout);
              if(error!= null) {System.out.println("Error in reservation :" + error);}

              else {  System.out.println("Reservation : "+ reservation);}

        }
sc.close();


    }



}
