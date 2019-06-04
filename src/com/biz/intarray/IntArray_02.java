package com.biz.intarray;

public class IntArray_02 {

	public static void main(String[] args) {
			
		//학생 개별 점수를 변수에 일단 저장하는 부분
		//학생 개별 점수는 어떤 규칙을 부여할 수 없으므로
		//어쩔 수 없이 작성해야 하는 코드
		//이 부분 코드는 간편하게 작성하기가 상당히 어려움
		int intKor_01 = 90;
		int intKor_02 = 70;
		int intKor_03 = 80;
		int intKor_04 = 77;
		int intKor_05 = 90;
		int intKor_06 = 78;
		int intKor_07 = 60;

		//intsum 클리어 시키기
		/*
		 * 총점을 계산하는 부분은
		 * 거의 코드가 유사한데
		 * 끝에 숫자 2자리만 연속으로 1씩 증가되고 있는것을 볼수 있다.
		 * 그렇다면 앞에 학습한 for명령을 이용해서 뭔가 해볼 수 있을거같다.
		 * 보통
		 * for(i=1; i<=30; i++){
		 * intSum += intKor_i;
		 * }라는 코드를 짠다.
		 * 그러나 우리는 i가 알아서 증가해서 연산할거라 생각하지만, 컴퓨터 내에서
		 * intKor_i를 변수로 계산한다.
		 * 
		 * String a = "03";
		 * int intNum_03 = 0;
		 * intNum_a =100; <- intNum_a라는 변수로 인식.
		 * intNum + a = 100;
		 * 
		 * 상기의 것들은 우리가 생각할 때
		 * intNum_03 = 100;이라고 번역될 것으로
		 * 보이지만 컴퓨터는 인식하지 못하는 문법이다.
		 * 
		 */
		int intSum = 0;
		 intSum += intKor_01;
		 intSum += intKor_02;
		 intSum += intKor_03;
		 intSum += intKor_04;
		 intSum += intKor_05;
		 intSum += intKor_06;
		 intSum += intKor_07;

		System.out.println("국어점수 총점 : "+intSum);
		
		float fAvg = 0;
		fAvg = intSum / 7.0f;
		System.out.println("국어점수 학급 평균 : " + fAvg);
	}

}
