package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.OrderNum = 201803120001L;
		order.OrderID = "abc123";
		order.OrderDate = "2018�� 3�� 12��";
		order.OrderName = "ȫ�浿";
		order.productID = "PD0345-12";
		order.Address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.OrderNum);
		System.out.println("�ֹ��� ���̵�  : " + order.OrderID);
		System.out.println("�ֹ� ��¥ : " + order.OrderDate);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productID);
		System.out.println("��� �ּ� : " + order.Address);
	}

}
