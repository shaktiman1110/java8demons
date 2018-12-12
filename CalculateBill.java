package interfacechangeinjava8;

public class CalculateBill implements hotel {

	String status;

	public CalculateBill(String status) {
		this.status = status;
	}

	@Override
	public void calulateBill() {
		// TODO Auto-generated method stub
		// get the Gst
		hotel.grtGstRate(status);
		System.out.println("Now i will add gst in the total bill");
	}

	public static void main(String[] args) {
		CalculateBill calulateBill = new CalculateBill("ac");
		calulateBill.calulateBill();
	}
}
