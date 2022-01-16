package inheritance;

public class Customer {
	protected int customerID; //���� ���̵� 
	protected String customerName; //���� �̸�
	protected String customerGrade; //���� ���
	int bonusPoint; //���ʽ� ����Ʈ
	double bonusRatio; //���� ����
	
	public Customer() { }
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) { //���ʽ� ����Ʈ ����, ���� ���� ��� �޼���
		bonusPoint += price * bonusRatio; //���ʽ� ����Ʈ ���
		return price;
	}
	
	public String showCustomerInfo() { //���� ������ ��ȯ�ϴ� �޼���
		return customerName + "���� �����" + customerGrade + "�̸�,���ʽ� ����Ʈ��" + bonusPoint + "�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}