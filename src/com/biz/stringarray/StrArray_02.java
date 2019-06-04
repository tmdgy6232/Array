package com.biz.stringarray;

public class StrArray_02 {

	public static void main(String[] args) {

		String[] strNames = {"홍","길","동"};
		for(int i=0; i<3;i++) {
			System.out.print(strNames[i]);
		}
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//메인 안에서 문제가 생겼다. 어레이 첨자값이 범위를 벗어났다 : 3이라는 값이
		//at com.biz.stringarray.StrArray_02.main(StrArray_02.java:13)
		//위치는 자바의 Strarray_02 클래스의 13번째 줄이다.
		
		
		System.out.println(strNames[3]);
		
		String[] strNations = {"대","한","민","국"};
		for(int i=0; i<4;i++) {
			System.out.print(strNations[i]);
		}
	}

}
