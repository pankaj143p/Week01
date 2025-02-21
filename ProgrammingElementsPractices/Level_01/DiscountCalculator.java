class DiscountCalculator{
	public static void main(String[] args) {
		// create a variable fee and assign value 125000
		int fee=125000;
		// create a variable discountPercent and assign value 10
		int discountPercent=10;
		// create a variable for calculating discount
		int discount=(fee*discountPercent)/100;
		// calculate discounted fee
		int discountedFee=fee-discount;
		// display the discount and discounted fee
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
