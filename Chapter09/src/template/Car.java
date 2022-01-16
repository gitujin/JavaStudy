package template;

public abstract class Car {
	public abstract void drive(); //추상 메서드
	public abstract void stop(); //추상 메서드
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { //구현된 메서드
		startCar(); //시동 켬 _ 구현된 메서드
		drive(); //차종에 따라 다른 방식 _ 추상 메서드
		wiper();
		stop(); //차종에 따라 다른 방식 _ 추상 메서드
		turnOff(); //시동 끔 _ 구현된 메서드
	}
}
