package constructor;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {
		
	}
	
	public Person(String pname) {
		name = pname;
	} //사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
