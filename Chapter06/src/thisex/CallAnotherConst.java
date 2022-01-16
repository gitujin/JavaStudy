package thisex;

class Person{
	String name;
	int age;

	Person(){ //Person 디폴트 생성자
		this("이름 없음",1); //this를 사용해 Pesrson(String,int) 생성자 호출
	}
	
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}

}
