/*
1. 자바가 제공하는 기본타입 (원시타입) >> 8가지 
2. 8가지 타입은 값을 저장하는 타입
숫자	정수(음의정수 0 양의정수) 	   byte(8bit) -128 ~ 127
								  	   char(2byte) 한문자 (내부적으로는 정수값) 
								  	   영문자, 특수문자, 공백 (1byte) , 한글 1자(2byte)
								  	   협의 (국제) >> 모든 문자는 2byte >> 표준화 >> unicode >> 아스키 코드표
								  	   ex) char c = 'A' , char = '가'
								  	   short 호환성
								  	   int (4byte) -21억 ~ 21억 **~~ ** 정수 리터럴의 기본 타입은 int 
								  	   long (8byte) 
								  	    
 		실수(부동소수점)			   float (4byte)	7자리 정도의 소수 표현 가능
 									   double (8byte)	15자리 정도의 소수 표현 가능
 									   정밀도가 높다(표현범위가 크다) **~~** 실수 리터럴의 기본 타입은 double
		
논리	boolean						   참 거짓을 표현하는 타입 (true false) 판단

가장 많이 사용하는 타입은 String // class 이다 // 문자열을 담을 수 있음 
String str = "hoog";
String str = new String("hoog");
약속 ) 8가지 + 1가지(String) 

자바의 타입
1. 값타입 8 + 1 
2. 참조타입 class interface 배열 ...

[정수값을 표기하는 방법]
100 	십진수
0x2a	16진수
0123	8진수
0b11010	2진수
123L or 123l	리터럴 long 타입 십진수 **
Ox2aL 			리터럴 long 타입 16진수
[실수를 표기하는 방법]
31.4
123.4
123.4F 123.4f
1.234e2승 >> 123.4 값을 지수 표기법
1.234e2승f

문자값을 표기하는 방법
'A' or '가'
'\u0065'

진리값을 표기하는 방법
true
false

문자열을 표기하는 방법
"홍길동"
"abcd"

*/


public class Ex03_DataType {
	public static void main(String[] args) {
		// int ( -21억 ~ 21억 )
		int num = 1000000000;
		System.out.println("num : " + num);
//		int num2 = 1000000000000; // The literal 1000000000000 of type int is out of range
		// literal 개발자가 직접 입력한 값 ( 있는 그대로의 값 )
		// 컴파일 오류
		// 나는 4byte 크기의 방인데 ... 더 큰 값은 담을 수 없어
		
		long num2 = 1000000000000L;
		System.out.println(num2);
		long num3 = 100;	// 속지 않을려면 값을 보지 말고 타입을 보세요 (리터럴값도)
							// long num3 = (long)100
							// 암시적 형변환 (자동으로 컴파일러가 ... 큰타입에 작은 타입을 넣는 것은)
							// 작은 타입에 있는 값을 큰 타입에 넣는 것 가능
		// 해결법
		// 손실이 발생하더라도 담아보겠다
		//int num4 = 1000000000000; // The literal 1000000000000 of type int is out of range
		// int num4 = 10000000000L;	// Type mismatch: cannot convert from long to int
		// 담아 담아 ( 손실....) 명시적 형변환 ( 타입 변환 )
		int num4 = (int)10000000000L;
		System.out.println("타입 변환 num4 : " + num4); // 타입 변환 num4 : 1410065408 쓰레기값 고스트데이터
		// 정상적인 해결 방법이 아니다
		
		// 데이터 손실이 없다 있을 수도 있음
		// 1. 강제 형변환
		// int num5 = (int) 1000L; // Type mismatch: cannot convert from long to int
		// 2. 담을 그릇을 크게
		// long num5 = 1000L;
		
		// char 2byte : 한 문자를 표현하기 위해서 만든 타입
		// 영문자 , 특수문자 , 공백 , 한글 >>> 한문자로 표현하는 표준화
		// 한문자 >> 'A' , '가' , ' ' 
		// 문자열 >> "abcd" >> String str = "abcd";
		
		// 0~ (216-1) >> 0 ~ 65535
		char ch = '가';
		System.out.println("한문자 : " + ch);
		// char ch2 = '가나'; 예외발생 (컴파일 불가) 한문자만 가능
		
		ch = 'a'; // 97
		ch = 'A'; // 65
		// char 정수 타입 (문자를 저장하지만 내부적으로는 정수값을 가지고 있다)
		// 아스키 코드표에서 십진수값과 문자값을 비교해 보세요
		
		int chint = ch;
		System.out.println("ch 문자를 십진수로 보면 : " + chint);
		
		//int chint = ch;
		// 내부적으로 암묵적으로 자동 형변환이 발생 했음 (자동으로)
		// int chint = (int)ch;
		
		int chint2 = 'a';
		System.out.println("chint2 : " + chint2);
		int intch2 = (int)chint2;
		
		int intch3 = 65;
		// char chint3 = intch3; //Type mismatch: cannot convert from int to char
		
		// 1. 명시적 형변환 ( 데이터 손실가능성 O )
		//char chint3 = (char) intch3;
		
		// 2. 받는 그릇을 크게 ( 개발자의 의도 문자를 보고 싶다 )
		//int chint3 = intch3;
		
		char chint3 = (char) intch3;
		System.out.println("chint3 : " + chint3);
		
		/*
			1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
			1.1 리터럴 값에 대해서
			1.1.1 정수 리터럴의 기본 타입은 int
			1.1.2 실수 리터럴의 기본 타입은 double
			
			2. 암시작 형변환, 명시적 형변환
			2.1 큰타입에 작은타입의 값을 넣는 것은 암시적 형변환을 하기에 개발자는 그냥 사용 가능
			2.2 작은 타입에 큰타입을 넣고자 한다면 자동 형변환 지원 x 강제적(명시적) 형변환
			2.2.1 접미사 L , 소문자 l , (int)정수 , (long)정수
			KEY POINT 강제적 형변환은 데이터 손실을 감수...
			ex) char c = (char) int 범위값 ..... 손실발생 ... 
			
		 */
		
		// String 타입 (8+1) 값타입 처럼 사용하자 >> 값타입 처럼 써도 문제 없게 만들었어요
		// 문자열 >> 문자의 집합 >> 문자의 배열 
		// int , long 동일하게 사용하세요
		
		String name = "홍길동";
		
		String color ="red";
		color = color + " 방가방가"; // 오라클 + 산술만 해요 >> 결합 연산자 ||
		System.out.println(color);
		
		// TIP)
		// 연산자는 언어마다 표현이 달라요
		// JAVA >> + 산술 과 결헙
		
		
		
		
		
		
		
		// 4월 21일까지의 자바 스터디 계획 5주간 
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
	}

}












