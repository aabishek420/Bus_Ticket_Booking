package busTicketBooking;

public class Businfo {

	private int busno;
	private boolean ac;
	private int capacity;

	Businfo(int busno, boolean ac, int capacity) {
		this.busno = busno;
		this.ac = ac;
		this.capacity = capacity;
	}

	public void setbusno(int busno) {// mutators
		this.busno = busno;
	}

	public int getbusno() {
		return busno;
	}

	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getcapacity() { // accessor
		return capacity;
	}

	public void setac(boolean ac) {
		this.ac = ac;
	}

	public boolean isAc() {
		return ac;
	}

	public void displayinfo() {
		System.out.println("BusNo:" + busno + "\t" + " Ac: " + ac + " Capacity:  " + capacity);
	}

}
