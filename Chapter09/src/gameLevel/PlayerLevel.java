package gameLevel;

public abstract class PlayerLevel {
	public abstract void run(); //레벨마다 다르게 구현
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
