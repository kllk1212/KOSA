package kr.or.kosa;

// class == 설계도 == 데이터타입
public class Car {
		
	
	// 클래스 변수 -> 클래스 영역에서 static이 붙는 변수
	// 객체(=인스턴스)를 공유하는 변수로 여러 객체에 공통으로 사용하고 싶을 때 정의
	// 모든 객체에서 무조건 변하지 않는 공통점? 정도로 생각하면 될듯
	public static String brand = "기아";
	
	
	// 인스턴스 변수 -> 클래스 영역에서 static이 아닌 변수
	// 객체(=인스턴스)를 여러 개 생성했다면 각각의 참조 변수명(겟터 세터)으로 접근 가능하며
	// 각각의 값을 저장할 수 있음
	// 차종마다 달라질수 있는 부분
	private int door;
	private String carColor;
	
	
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	// 함수 앞 void -> 리턴값 x 단지 실행만 하겠다 
	public void run() {
		System.out.println("달린다");
	}
	public void stop() {
		System.out.println("달린다");
	}
	
	
}
