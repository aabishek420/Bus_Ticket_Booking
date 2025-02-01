package busTicketBooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Costumeinfo {
	
	String cosname;
	int busno;
	Date date;

	// get value directly from calling the constructor
	Costumeinfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the passenger name:");
		cosname = scan.next();
		System.out.println("Enter the bus no:");
		busno = scan.nextInt();
		System.out.println("Enter the travelling date->dd-mm-yyyy:");
		String Dateinput = scan.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = sdf.parse(Dateinput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Costumeinfo> booking, ArrayList<Businfo> busses) {
		int capacity = 0;
		for (Businfo bus : busses) {
			if (bus.getbusno() == busno) {
				capacity = bus.getcapacity();

			}
		}
		int booked = 0;
		for (Costumeinfo c : booking) {
			if ( c.busno == busno&& c.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;

	}
}

