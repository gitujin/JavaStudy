package q4;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogArray = new Dog[5];
		
		dogArray[0] = new Dog("�۸���","ġ�Ϳ�");
		dogArray[1] = new Dog("�ǻ�","������");
		dogArray[2] = new Dog("������","��찳");
		dogArray[3] = new Dog("ö��","����Ƽ��");
		dogArray[4] = new Dog("����","Ǫ��");
		
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
		
	}

}
