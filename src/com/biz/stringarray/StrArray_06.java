package com.biz.stringarray;

public class StrArray_06 {

	public static void main(String[] args) {

		
		//문자열.split(" ");
		//이 매서드는 문자열을 빈칸을 기준으로 나눠서
		//분해해서 배열롷 생성하라
		String strName = "홍길동 이몽룡 성춘향 임꺽정";
		String[] strNames = strName.split(" ");
		for(int i=0; i< strNames.length;i++) {
			System.out.println(i+"번째 : "+ strNames[i]);
		}
	}

}
