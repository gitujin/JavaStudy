package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.OrderNum = 201803120001L;
		order.OrderID = "abc123";
		order.OrderDate = "2018년 3월 12일";
		order.OrderName = "홍길동";
		order.productID = "PD0345-12";
		order.Address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order.OrderNum);
		System.out.println("주문자 아이디  : " + order.OrderID);
		System.out.println("주문 날짜 : " + order.OrderDate);
		System.out.println("주문 상품 번호 : " + order.productID);
		System.out.println("배송 주소 : " + order.Address);
	}

}
