package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Person person1 = new Person(); //생성자로 생성하기
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");//Person 클래스 이름을 사용하여 Class를 반환
		Person person2 = (Person)pClass.newInstance(); //Class 클래스의 newInstance()메서드로 생성하기
		//newInstance() 메서드를 호출하여 Person클래스의 디폴트 생성자가 호출되어 인스턴스가 생성
		
		System.out.println(person2);
	}

}
