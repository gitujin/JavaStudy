package ex6_2;

public class Card {
	public static int SerialNum = 10000;
	public int CardNum;
	
	public Card() {
		SerialNum++;
		CardNum = SerialNum;
	}

	public int getCardNum() {
		return CardNum;
	}

	public void setCardNum(int cardNum) {
		CardNum = cardNum;
	}
	
	
}
