package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
