package q2;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			//System.out.println(ch);
			ch++;
		}                                                                                                                                                                            
		
		for(int i=0; i<alphabets.length; i++){
			alphabets[i] = (char)( alphabets[i] + 32);
		}
		
		for(int i=0 ; i<alphabets.length; i++, ch++){
			System.out.println(alphabets[i]);
		}
		
	/*	for(int i = 0; i < alphabets.length; i++) {
			System.out.println("대문자 : " + alphabets[i] + "소문자 : " + alphabets[i] + 36);
			
		}*/
	}
}
