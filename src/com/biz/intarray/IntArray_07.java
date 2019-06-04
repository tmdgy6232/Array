package com.biz.intarray;

public class IntArray_07 {

	public static void main(String[] args) {

		int[] intKor = new int[10];
		intKor[0] = 90;
		intKor[1] = 80;
		intKor[2] = 90;
		
		//이미 초기화되어 사용중인 배열을
		//다시 초기화하면 이전에 저장되어있던 값들은
		//모두 사라진다.
		intKor = new int[5];
		System.out.println(intKor[0]);
		
		//배열에 대입, 저장할 값이 미리 정해져 있을 때
		// 값을 대입하면서 배열을 선언, 초기화 시키는 방법
		int[] intEng = {1, 3, 5, 6, 7,8,9,10};
		System.out.println(intEng[4]);
		
		
	}

}
