package interfacechangeinjava8;

public interface hotel {

	static void grtGstRate(String status) {
		if (status.equalsIgnoreCase("ac")) {
			System.out.println("GST of 14% will be added to total bill");
		} else {
			System.out.println("GST of 12% will be added to total bill");
		}
	}

	void calulateBill();
}
