package thisex;

public class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) { //�¾ ������ �����ϴ� �޼���
		this.year = year; //bDay.year;�� ����
	}
	
	public void printThis() { //this ��� �޼ҵ�
		System.out.println(this); //System.out.println(bDay);�� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //�¾ ������ 2000���� ����
		System.out.println(bDay); //���� ���� ���
		bDay.printThis(); //this ��� �޼��� ȣ��
	}

}
