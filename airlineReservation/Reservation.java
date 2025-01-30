package airlineReservation;

public class Reservation {
  
	private String name;
	private Flight Flight;
	public Reservation(String name, airlineReservation.Flight flight) {
		super();
		this.name = name;
		Flight = flight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Flight getFlight() {
		return Flight;
	}
	public void setFlight(Flight flight) {
		Flight = flight;
	}
	@Override
	public String toString() {
		return "Reservation [name=" + name + ", Flight=" + Flight + "]";
	}
	
}
