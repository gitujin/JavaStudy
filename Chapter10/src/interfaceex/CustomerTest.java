package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy(); //Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� �� ��ȯ,buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		buyer.order();
		
		Sell seller = customer;
		seller.sell(); //Customer Ŭ�������� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ, buyer Buy �������̽��� �޼��常 ȣ�� ����
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller; //seller�� ���� Ŭ�������� Customer�� �ٽ� �� ��ȯ
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
