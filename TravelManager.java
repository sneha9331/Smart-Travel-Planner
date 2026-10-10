package travelplanner;

public class TravelManager {

	private TravelOption[] options;
	private Booking[] bookings;
	private int bookingCount;

	public TravelManager() {

		options = new TravelOption[3];

		options[0] = new Train(500);
		options[1] = new Bus(300);
		options[2] = new Flight(2500);

		bookings = new Booking[100];

		bookingCount = 0;
	}

	public void displayOptions() {

		System.out.println("\n===== AVAILABLE TRAVEL OPTIONS =====");

		for (int i = 0; i < options.length; i++) {

			System.out.print((i + 1) + ". ");
			options[i].displayOption();
		}
	}

	public TravelOption getOption(int choice) {

		if (choice >= 1 && choice <= options.length) {

			return options[choice - 1];
		}

		return null;
	}

	public boolean addBooking(Booking booking) {

		if (bookingCount < bookings.length) {

			bookings[bookingCount] = booking;
			bookingCount++;

			return true;
		}

		System.out.println("Booking storage is full.");

		return false;
	}

	public void displayAllBookings() {

		if (bookingCount == 0) {

			System.out.println("No bookings available.");

		} else {

			System.out.println("\n========== ALL BOOKINGS ==========");

			for (int i = 0; i < bookingCount; i++) {

				System.out.println("\nBooking Number: " + (i + 1));

				bookings[i].displayBooking();
			}
		}
	}

	public int getBookingCount() {

		return bookingCount;
	}
}