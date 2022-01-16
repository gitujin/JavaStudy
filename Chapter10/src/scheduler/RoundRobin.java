package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() { //다음 전화를 가져오는 기능
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() { //상담원에게 전화를 배분하는 기능
		// TODO Auto-generated method stub
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
}
