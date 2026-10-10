package travelplanner;

import java.util.Scanner;

public class SmartTravelPlanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TravelManager manager = new TravelManager();

		Traveller traveller = null;

		int choice;

		System.out.println("==================================");
		System.out.println("      SMART TRAVEL PLANNER");
		System.out.println("==================================");

		while (true) {

			System.out.println("\n========== MAIN MENU ==========");
			System.out.println("1. Create Traveller Profile");
			System.out.println("2. View Travel Options");
			System.out.println("3. Book a Trip");
			System.out.println("4. View All Bookings");
			System.out.println("5. View Total Profiles");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Enter Traveller ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Destination: ");
				String destination = sc.nextLine();

				System.out.print("Enter Number of Travellers: ");
				int count = sc.nextInt();
				sc.nextLine();

				if (count <= 0) {

					System.out.println("Number of travellers must be greater than zero.");

				} else {

					traveller = new Traveller(id, name, destination, count);

					System.out.println("Traveller profile created successfully!");
				}

				break;

			case 2:

				manager.displayOptions();

				break;

			case 3:

				if (traveller == null) {

					System.out.println("Please create a traveller profile first.");

					break;
				}

				manager.displayOptions();

				System.out.print("Select Travel Option: ");
				int travelChoice = sc.nextInt();
				sc.nextLine();

				TravelOption selectedOption = manager.getOption(travelChoice);

				if (selectedOption == null) {

					System.out.println("Invalid travel option!");

					break;
				}

				double totalFare = selectedOption.calculateFare(traveller.getNumberOfTravellers());

				Booking booking = new Booking(traveller, selectedOption, totalFare);

				if (manager.addBooking(booking)) {

					System.out.println("Booking created successfully!");

					booking.displayBooking();
				}

				break;

			case 4:

				manager.displayAllBookings();

				break;

			case 5:

				System.out.println("Total Profiles Created: " + Traveller.getTotalProfiles());

				System.out.println("Total Bookings Created: " + manager.getBookingCount());

				break;

			case 6:

				System.out.println("Thank you for using Smart Travel Planner!");

				sc.close();

				return;

			default:

				System.out.println("Invalid menu choice. Please try again.");
			}
		}
	}
}