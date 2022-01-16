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
	
	public void showInfo() { //지하철 정보 출력하는 메서드
		System.out.println(companyName + "사 택시의 수입은 " +  money + " 입니다.");
	}
}
