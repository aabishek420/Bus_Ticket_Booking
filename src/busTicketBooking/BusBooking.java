package busTicketBooking;

import java.util.*;

public class BusBooking {

	public static void main(String[] args) {
		
		ArrayList<Businfo> busses = new ArrayList<Businfo>();
		ArrayList<Costumeinfo> booking = new ArrayList<Costumeinfo>();

		busses.add(new Businfo(1, true, 0));
		busses.add(new Businfo(2, false, 0));
		busses.add(new Businfo(3, true, 1));

		int userOption = 1;
		Scanner in = new Scanner(System.in);

		for (Businfo b : busses) {
			b.displayinfo();
		}
		while (userOption == 1) {
			System.out.println("Enter 1 to booking or 2 to Exit");
			userOption = in.nextInt();
			if (userOption == 1) {
				// System.out.println("Status-> Booking...");
				Costumeinfo book = new Costumeinfo();
				if (book.isAvailable(booking, busses)) {
					booking.add(book);
					System.out.println("your Booking is comfirmed");
				} else {
					System.out.println("sorry.. Bus is full Try another bus or date");

				}
			}

		}

	}
}
