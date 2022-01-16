package innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//num = 200;
				//i = 100;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� ���� ����)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
			}
			
		}
		return new MyRunnable();
	}
}
public class LocalInerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
