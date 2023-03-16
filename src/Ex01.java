import kr.or.kosa.Car;

public class Ex01 {

	// JAVA 는 어플리케이션이 실행되면 제일먼저 메인(main)메소드를 실행함
	// 이 메인메소드는 자바 어플리케이션 실행시 제일먼저 동작하며 어느 객체에서든 접근할수 있으며 자바가 컴파일 되는 순간 정의되는 돌려주는 값이없는 함수
	public static void main(String[] args) {
		// System.out.println("hello world!"); // 컨트롤 + F11 (저장 > 컴파일 > 실행)
		
		// A >> Car.class
		
		// B >> Car.class
		
		// C >> 하나의 장소에 넣을 경우 >> 무슨 문제?? >> 중복 
		// -> 도메인으로 해결 www.jaehoon.co.kr -> kr.co.jaehoon.www 패키지 폴더로 
		// 도메인은 유일한 값
		
		// 자동차 생산
		//Car myCar; // 지역변수( main 안에 있는 ) -> stack 메모리만 차지 아직 객체생성 x heap 메모리 차지안함
		
		
		// Car.brand  -> Car에서 static 으로 선언한 클래스 변수
		String brand = Car.brand;
		System.out.println("브랜드 : " + brand);
		
		Car myCar = new Car();
		myCar.setDoor(2);
		myCar.setCarColor("red");
		myCar.stop();
		
		// stack 메모리 -> 메인 함수 생성 영역  
		
		// heap 메모리 -> new 객체 생성시 메모리 차지 , stack 변수에 값을 할당해줌

	
		
		
		
		
	}

	
}