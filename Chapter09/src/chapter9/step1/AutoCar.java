package chapter9.step1;

public class AutoCar extends Car{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("�ֹ����� �����մϴ�.");
	}
	
	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
