package com.biz.intarray;

public class IntArray_01 {

	public static void main(String[] args) {

		int intKor_01 = 90;
		int intKor_02 = 70;
		int intKor_03 = 80;
		int intKor_04 = 77;
		int intKor_05 = 90;
		int intKor_06 = 78;
		int intKor_07 = 60;

		//intsum 클리어 시키기
		/*
		 * 이 같은 코드의 경우 변수는 임의의 값을 넣어줄 수 없으므로 변수발생
		 * 에 대해서는 일일이 작성해야 하지만, 아래 인트썸 연산에 관해서는 
		 * 변경할 수 있다.
		 */
		int intSum = 0;
		intSum = intKor_01+intKor_02+intKor_03+intKor_04+intKor_05
				+intKor_06+intKor_07;
		// intSum += intKor_01;
		System.out.println("국어점수 총점 : "+intSum);
		
		float fAvg = 0;
		fAvg = intSum / 7.0f;
		System.out.println("국어점수 학급 평균 : " + fAvg);
	}

}
