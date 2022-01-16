package classpart;

public class Student {
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); //새로운 Student 클래스 생성
		studentAhn.studentName = "송유진"; //클래스의 멤버 변수에 값을 대입
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
