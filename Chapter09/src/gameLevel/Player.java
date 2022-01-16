package gameLevel;

public class Player {
	private PlayerLevel level; //player�� ������ level ���� ����
	
	public Player() { //player ������ ������
		level = new BeginnerLevel(); //�ʱ� ���� Begginer�� ����
		level.showLevelMessage(); //���� ���� ���
	}
	
	public PlayerLevel gerLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count); //go()�޼��� ȣ��
	}
}
