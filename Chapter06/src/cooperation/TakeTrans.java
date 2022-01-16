package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student("James",5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100); //노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100); //James가 100번 버스를 탐
		studentJames.showInfo(); //james 정보 출력
		bus100.showInfo(); //버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선"); //노선 번호가 2호선인 지하철 생성 
		studentTomas.takeSubway(subwayGreen); //Tomas가 2호선을 탐
		studentTomas.showInfo(); //Tomas 정보 출력
		subwayGreen.showInfo(); //지하철 정보 출력
		
		Taxi taxi = new Taxi("taxi1");
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
		
	}

}
