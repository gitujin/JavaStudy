package ex6_2;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company1 = CardCompany.getInstance();
		
		Card myCard = company1.createCard();   //�޼��忡�� Car ����
		Card yourCard = company1.createCard();
		
		System.out.println(myCard.getCardNum());    //10001  ���
		System.out.println(yourCard.getCardNum());  //10002  ���
	}

}
