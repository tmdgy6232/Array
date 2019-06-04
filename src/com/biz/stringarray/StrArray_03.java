package com.biz.stringarray;

public class StrArray_03 {

	public static void main(String[] args) {

		String[] strNation = {"대","한","민","국","만","세"};
		

//		for(int i=0; i<6; i++) {
//		System.out.print(strNation[i]);
//	}

		
		//배열.length는 배열이 생성되는 순간.
		// 배열 내부에 자동으로 생성되는 변수이다
		// 이런 변수들을 속성(property)라고 부르기도 하며
		//배열의 length 속성은 배열의 갯수를 알 수 있는 속성이다.
		for(int i=0; i<strNation.length; i++) {
		System.out.print(strNation[i]);
	}

	}

}
