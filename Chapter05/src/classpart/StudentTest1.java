package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(); //새로운 Student 클래스 생성
		student1.studentName = "송유진"; //클래스의 멤버 변수에 값을 대입
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student(); //새로운 Student 클래스 생성
		student2.studentName = "송유경"; //클래스의 멤버 변수에 값을 대입
		System.out.println(student2.getStudentName());
		
	}

}
