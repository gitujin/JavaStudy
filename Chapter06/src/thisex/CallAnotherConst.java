package thisex;

class Person{
	String name;
	int age;

	Person(){ //Person ����Ʈ ������
		this("�̸� ����",1); //this�� ����� Pesrson(String,int) ������ ȣ��
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
