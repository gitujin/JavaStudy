package chapter5;

public class Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.num = 201803120001L;
		order.ID = "abc123";
		order.Date = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.ordernum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order.num);
		System.out.println("�ֹ��� ���̵�: " + order.ID);
		System.out.println("�ֹ� ��¥: " + order.Date);
		System.out.println("�ֹ��� �̸�: " + order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order.ordernum);
		System.out.println("��� �ּ�: " + order.address);
	}

}
