package travelplanner;

public class Train extends TravelOption {

	public Train() {

	}

	public Train(double fare) {
		super("Train", fare);
	}

	@Override
	public double calculateFare(int travellers) {
		return fare * travellers;
	}
}