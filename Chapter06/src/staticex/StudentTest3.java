package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1();
		studentLee.setStudentName("������");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName + " �й�" + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName + " �й� :" + studentSon.studentID);
	}

}
