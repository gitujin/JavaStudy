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
		Student studentAhn = new Student(); //���ο� Student Ŭ���� ����
		studentAhn.studentName = "������"; //Ŭ������ ��� ������ ���� ����
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
