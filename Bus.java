package travelplanner;

public class Bus extends TravelOption {

    public Bus() {

    }

    public Bus(double fare) {
        super("Bus", fare);
    }

    @Override
    public double calculateFare(int travellers) {
        return fare * travellers;
    }
}