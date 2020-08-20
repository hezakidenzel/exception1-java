package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Reservation;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Reservation> list = new ArrayList<>();
		
		System.out.println("Room Number");
		int number = ler.nextInt();
		
		System.out.println("Enter Date checkin");
		Date checkin = sdf.parse(ler.next());
		System.out.println("Enter Date checkout");
		Date checkout = sdf.parse(ler.next());
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in Resevation: Check-out date must  be after  check-in date");
		}
		else {
			Reservation reservation = new Reservation(number,checkin, checkout);
			System.out.println("Reservation :"+reservation);
			
			System.out.println("Enter data to update the reservation");
			System.out.println("Enter Date checkin");
			 checkin = sdf.parse(ler.next());
			System.out.println("Enter Date checkout");
			 checkout = sdf.parse(ler.next());
			 
			 Date now = new Date();
			 
			 if(checkin.before(now) || checkout.before(now)) {
				 System.out.println("Error in Resevation: Reservation dates for update must be future");
			 }
			 else if(!checkout.after(checkin)) {
				 System.out.println("Error in Resevation: Check-out date must  be after  check-in date");
			 }else {
				 reservation.updateDates(checkin, checkout);
				 System.out.println("Reservation :"+reservation);
			 }
			 

		}
		
		
		
		
		
		
		ler.close();
	}

}
