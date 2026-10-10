package travelplanner;

public class Booking {

	private Traveller traveller;
	private TravelOption travelOption;
	private double totalFare;

	public Booking() {

	}

	public Booking(Traveller traveller, TravelOption travelOption, double totalFare) {

		this.traveller = traveller;
		this.travelOption = travelOption;
		this.totalFare = totalFare;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void displayBooking() {

		System.out.println("\n========== BOOKING SUMMARY ==========");

		traveller.displayTraveller();

		System.out.println("Travel Mode     : " + travelOption.getMode());

		System.out.println("Fare per Person : Rs. " + travelOption.getFare());

		System.out.println("Total Fare      : Rs. " + totalFare);

		System.out.println("=====================================");
	}
}