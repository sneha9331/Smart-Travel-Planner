package travelplanner;

public class Traveller {

	private int travellerId;
	private String name;
	private String destination;
	private int numberOfTravellers;

	private static int totalProfiles = 0;

	public Traveller() {

	}

	public Traveller(int travellerId, String name, String destination, int numberOfTravellers) {

		this.travellerId = travellerId;
		this.name = name;
		this.destination = destination;
		this.numberOfTravellers = numberOfTravellers;

		totalProfiles++;
	}

	public int getTravellerId() {
		return travellerId;
	}

	public String getName() {
		return name;
	}

	public String getDestination() {
		return destination;
	}

	public int getNumberOfTravellers() {
		return numberOfTravellers;
	}

	public static int getTotalProfiles() {
		return totalProfiles;
	}

	public void displayTraveller() {

		System.out.println("\n----- TRAVELLER DETAILS -----");
		System.out.println("Traveller ID : " + travellerId);
		System.out.println("Name         : " + name);
		System.out.println("Destination  : " + destination);
		System.out.println("Travellers   : " + numberOfTravellers);
	}
}