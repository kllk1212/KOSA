import kr.or.kosa.Emp;

public class Ex02_Variable {
	
	public static void main(String[] args) {
		// 변수 선언
		int value;	// 선언 초기화 되지 않았다
		value =100;	// 할당
		
		int age = 99; // 선언과 할당을 동시에
		
		// 지역 변수 : main 함수 안 변수
		int num = 0;
		System.out.println(num); 
		// 지역변수는 사용시 반드시 초기화를 해야 한다
		// 지역변수는 무조건 초기화 하고 사용한다
		
		// 초기값 정의(초기화) : 변수의 초기화 : 변수가 처음 값을 갖는것 (할당을 통해서)
		
		// 스택 메모리에서 4바이트 차지 (주소값이 담겨있음)
		Emp emp; // emp 지역변수
		emp = new Emp(); // new 연산자 메모리에 올리는 작업 >> 초기화 작업 >> heap 생성된 객체의 주소값(x번지)
		// 설계도와 똑같은 집을 짓는다.(heap 메모리에)
		System.out.println(emp);
		
		// . 주소를 찾아가는 연산자 
		System.out.println(emp.empno);
		System.out.println(emp.str);
		
		int a,b,c; // 같은 타입의 변수를 나열 > 개발자 생각 > 배열 (Array) int[] a
		a = 100;
		b = 100;
		c = 100; // 사용가능
		
		int data = 100; 
//		int data; 같은 지역 내에서 같은 변수명은 존재할 수 없어요.
		data = 200;
		int result = a + b; // 초기화
		System.out.println("result 값 : " + result);
		
		int k = 100;
		int y = k;
		
		y = 200;
		
		// 프리미티브 타입 / 레퍼런스 타입
		
		
		
		// 참조 == 레퍼런스 
		
		
	}
}


/*
	블럭주석
	
	클래스 == 설계도 == 데이터 타입
	
	클래스의 종류
	
	1. class Car {} > main 함수를 가지지 않은 클래스 > 독자적 실행 x > 다른 클래스에 도움을 주는 클래스 (lib)
	2. class Car{ public void main(String[] args){} } > main함수를 가지고 있는 클래스 > 독자적 실행 o 
	3. 현재는 main 함수를 가지고 있는 클래스가 있어야 결과 확인가능
	4. public void main(String[] args) >> static (new 없이도 메모리에 생성) >> 함수의 이름 (main) : 시작점,진입점
	
	TIP)
	C# 코드 >> class Car{ public void Main(String[] args){} }
	
	변수 : variable
	데이터 (자료) 담을 수 있는 공간(메모리)의 이름
	공간(크기) >> 데이터 타입(자료형) >>  메모리의 공간이 한정 >> 최소한의 공간 초대한 데이터 표현	
	int data = 100;
	
	변수가 선언되는 위치 (scope : 유효범위)
	
	1. instance variable : 객체 변수(클래스안에)  >> class Car{ public int door; } 클래스가 가진변수
	
	2. local variable : 지역 변수(함수안에) 	  >> class Car{ public void run(){ int data = 0; } } 
	
	3. static variable : 공유 자원 (객체간)		  >> class Car{ public static int num; }
	
	4. 함수 안에 있는 제어블럭 안에 있는 변수 (if , for ) 블럭변수 >> class Car{ void run(){ for(int i = 0...)} }
	
	
	


*/

