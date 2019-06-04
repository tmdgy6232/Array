package com.biz.intarray;

public class IntArray_06 {

	public static void main(String[] args) {

		// 선언부[] 변수명 = 배열 생성하기
		// 배열의 초기화라 한다.
		// 각 배열의 내용은 int형일 경우 모두 0으로 클리어
		int[] intKor = new int[30];
		int intEng[] = new int[30];
		
		//배열을 선언만 하기
		int[] intMath;
		
		//일반적인 변수는 선언 후 읽기는 안되지만 쓰기는 된다.
		//하지만 배열은 선언 후 초기화하지 않으면
		//읽기는 물론 쓰기조차 되지 않는다.
		//intMath[0] = 90;
		
		//선언 후 따로 초기화하기
		intMath = new int[30];
		//배열은 선언 후 초기화하지 않으면 읽기 안된다.
		System.out.println(intMath[0]);
		
		
	}

}
