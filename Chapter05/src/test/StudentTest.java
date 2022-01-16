package test;

import classpart.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student(); //새로운 Student 클래스 생성
		studentAhn.studentName = "송유진"; //클래스의 멤버 변수에 값을 대입
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
