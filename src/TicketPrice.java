
public class TicketPrice {

	private int standardPrice = 100;
	int discountRate;
	
	public int discountCalc(Customer customerInfo) {
		if (customerInfo.age <= 6) {
			return 0;
		}else if (customerInfo.isStudent) {
				return standardPrice*75/100;
		}else
			return standardPrice;
			
	}
	
}
