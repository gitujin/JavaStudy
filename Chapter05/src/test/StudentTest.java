package test;

import classpart.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student(); //���ο� Student Ŭ���� ����
		studentAhn.studentName = "������"; //Ŭ������ ��� ������ ���� ����
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
