package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class personClass = Person.class;
		Constructor[] cons = personClass.getConstructors(); //��� ������ ��������
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		Field[] fields = personClass.getFields(); //��� ����(�ʵ�) ��������
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		Method[] methods = personClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}
