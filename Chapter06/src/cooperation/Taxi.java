package cooperation;

public class Taxi {
	int money;
	String companyName;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() { //����ö ���� ����ϴ� �޼���
		System.out.println(companyName + "�� �ý��� ������ " +  money + " �Դϴ�.");
	}
}
