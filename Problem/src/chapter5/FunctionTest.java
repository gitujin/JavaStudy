package chapter5;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�.");
		
		int sub = sub(num1,num2);
		System.out.println(num1 + " - " + num2 + " = " + sub + "�Դϴ�.");
		
		int mul = mul(num1, num2);
		System.out.println(num1 + " * " + num2 + " = " + mul + "�Դϴ�.");
		
		int div = div(num1, num2);
		System.out.println(num1 + " / " + num2 + " = " + div + "�Դϴ�.");
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result; 
	}
	
	public static int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
