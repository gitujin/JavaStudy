package gameLevel;

public class Player {
	private PlayerLevel level; //player가 가지는 level 변수 선언
	
	public Player() { //player 디폴드 생성자
		level = new BeginnerLevel(); //초기 레벨 Begginer로 지정
		level.showLevelMessage(); //현재 레벨 출력
	}
	
	public PlayerLevel gerLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count); //go()메서드 호출
	}
}
