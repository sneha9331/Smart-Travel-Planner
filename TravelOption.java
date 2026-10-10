package travelplanner;

public abstract class TravelOption {

	protected String mode;
	protected double fare;

	public TravelOption() {

	}

	public TravelOption(String mode, double fare) {
		this.mode = mode;
		this.fare = fare;
	}

	public String getMode() {
		return mode;
	}

	public double getFare() {
		return fare;
	}

	public abstract double calculateFare(int travellers);

	public void displayOption() {
		System.out.println(mode + " - Rs. " + fare + " per traveller");
	}
}