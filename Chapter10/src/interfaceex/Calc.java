package interfaceex;

public interface Calc {
	double PI = 3.14; //원주율
	int ERROR = -999999999; //오류가 났을 때 사용할 ERROR 변수
	
	//사칙 연산을 수행하기 위한 추상 메서드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1,int num2);
	int square(int num);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
