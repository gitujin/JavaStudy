package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Person person1 = new Person(); //�����ڷ� �����ϱ�
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");//Person Ŭ���� �̸��� ����Ͽ� Class�� ��ȯ
		Person person2 = (Person)pClass.newInstance(); //Class Ŭ������ newInstance()�޼���� �����ϱ�
		//newInstance() �޼��带 ȣ���Ͽ� PersonŬ������ ����Ʈ �����ڰ� ȣ��Ǿ� �ν��Ͻ��� ����
		
		System.out.println(person2);
	}

}
