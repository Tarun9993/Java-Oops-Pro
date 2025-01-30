package airlineReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

	static ArrayList<Flight> list = new ArrayList<Flight>();
	static ArrayList<Reservation> res = new ArrayList<Reservation>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		list.add(new Flight(112,"Andhra",15));
		list.add(new Flight(108,"Goa",10));
		list.add(new Flight(558,"Bangalore",4));
		
		while(true) {
			System.out.println("\n-----------Airline Reservation System---------");
		    System.out.println(" 1.Display Available Flights \n 2.Book a Flight \n 3.View Reservations \n 4.Cancle Booking\n 5.Exit");
		    System.out.println("Choose an Option :");
		    int choice =  getValidIntegerInput();
		    switch(choice) {
		    case 1:
		    	displayAvailableFlights();
		    	break;
		    case 2:
		    	bookFlight();
		    	break;
		    case 3:
		    	viewReservations();
		    	break;
		    case 4:
		    	cancleBooking();
		    	break;
		    case 5:
		    	System.out.println("Thank You..!");
		    	sc.close();
		    	return;
		    default:
		    	System.out.println("Invalid Choice Please try again..");
		    	break;
		}
		}

	}
	private static void cancleBooking() {
		System.out.println("Enter the name of the passener to cancle the flight");
		String cancleName = sc.next();
		Reservation resToCancle = null;
		for(Reservation r : res) {
			if(r.getName().equalsIgnoreCase(cancleName)) {
				resToCancle = r;
				break;
			}
		}
		if(resToCancle != null) {
			Flight flight = resToCancle.getFlight();
			flight.setAvailableSeats(flight.getAvailableSeats()+1);
			res.remove(resToCancle);
			System.out.println("Reservation is cancelled for passenger");
		}
		else {
			System.out.println("No Reservations made yet with the name : "+ cancleName);
		}
		
	}
	private static void viewReservations() {
		if(res.isEmpty()) {
			System.out.println("No Reservation done yet..!!");
		}
		else {
			System.out.println("-------Reservations-------");
			for(Reservation r : res) {
				System.out.println("PassengerName: "+ r.getName());
				System.out.println("Flight Number: "+ r.getFlight().getNumber());
				System.out.println("Designation : " +r.getFlight().getDesignation());
				System.out.println("-------------------------------------");
			}
		}
		
	}
	
	 private static void bookFlight() {
	        displayAvailableFlights();
	        System.out.println("Enter the Flight Number to book a flight: ");
	        int flightNumber = getValidIntegerInput();
	        Flight selected = null;

	        for (Flight flight : list) {
	            if (flight.getNumber() == flightNumber) {
	                selected = flight;
	                break;
	            }
	        }
	        if (selected.getAvailableSeats() > 0) {
	            System.out.println("Enter Passenger Name: ");
	            String passengerName = sc.next();
	            Reservation reservation = new Reservation(passengerName, selected);
	            res.add(reservation);
	            selected.decreaseAvailaleSeats();
	            System.out.println("Booking Successfully Completed!");
	        } else {
	            System.out.println("Sorry, no seats are available on the selected flight.");
	        }
	        if (selected == null) {
	            System.out.println("Invalid Flight Number. Try Again.");
	            return;
	        }

	    }

	private static void displayAvailableFlights() {
		System.out.println("\n------Available Flights------");
		for(Flight f : list) {
			System.out.println("FlightNumber : "+ f.getNumber()+", Designation : " +f.getDesignation() +", AvailableSeats : "+ f.getAvailableSeats());
		}
		
	}
	private static int getValidIntegerInput() {
		while(!sc.hasNextInt()) {
			System.out.println("Enter the proper number");
			sc.next();
		}
		return sc.nextInt();
	}

}
