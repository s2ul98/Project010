package main;

// 계산기 인터페이스
// 인터페이스는 상수와 추상메소드만 가질 수 있다
public interface Calc {

	int ERROR = -999;
	
	int add(int num1, int num2); // 더하기
	
	int substract(int num1, int num2); // 뺴기
	
	int times(int num1, int num2); // 곱하기
	
	int divide(int num1, int num2); // 나누기
}
