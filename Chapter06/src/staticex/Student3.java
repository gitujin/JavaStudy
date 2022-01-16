package staticex;

public class Student3 {
	private static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	int studentCardNum; //ÇĞ¹ø + 100
	
	public Student3() {
		studentCardNum += serialNum + 100;
		serialNum ++;
		studentID = serialNum;	
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
