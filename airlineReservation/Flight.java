package airlineReservation;

public class Flight {
	private int number;
	private String designation;
	private int availableSeats;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Flight(int number, String designation, int availableSeats) {
		super();
		this.number = number;
		this.designation = designation;
		this.availableSeats = availableSeats;
	}
	@Override
	public String toString() {
		return "Flight [number=" + number + ", designation=" + designation + "]";
	}
	
	public void decreaseAvailaleSeats() {
		if(availableSeats > 0) {
			availableSeats--;
		}
	}

}
