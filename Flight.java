package travelplanner;

public class Flight extends TravelOption {

	public Flight() {

	}

	public Flight(double fare) {
		super("Flight", fare);
	}

	@Override
	public double calculateFare(int travellers) {
		return fare * travellers;
	}
}