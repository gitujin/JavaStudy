package object;

class Student{
	int studentId;
	String studentName;
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100,"�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		if(studentLee == studentLee2) // == ��ȣ�� ��
			System.out.println("studentLee �� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2)) //equals() �޼���� ��
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		if(studentLee == studentSang) //== ��ȣ�� ��
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		
		System.out.println("studentLee�� hashCode : " + studentLee.hashCode());
		System.out.println("studentSang�� hashcode : " + studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּ� �� : " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּ� �� : " + System.identityHashCode(studentSang));
	}

}