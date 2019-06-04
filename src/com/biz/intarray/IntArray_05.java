package com.biz.intarray;

import java.util.Random;

public class IntArray_05 {

	public static void main(String[] args) {

		int[] intKor = new int[30];
		
		//임의의 숫자를 생성하기 위한 클래스
		//작성된걸 가져오기 때문에 shift^+o를 사용하여 임포트 시킨다.
		Random rnd = new Random();
		//배열과 함꼐 사용하는 for 명령문은
		//시작값은 0
		//종료값은 배열의 크기 -1까지 사용한다.
		for(int i =0; i<30; i++) {
			
			// 0부터 49까지 임의의 숫자를 생성해서
			// intKor의 i번째 위치에 대입(할당, 저장)한다.
			intKor[i] = rnd.nextInt(50) + 51; 
			// 0부터 49까지의 숫자를 생성하고
			//그 수에 51을 더하여
			// 50~100까지의 수를 랜덤으로 만들어
			//intKor[i]에 대입함
			
		}
		for(int i=0; i<30; i++) {
			System.out.print(intKor[i]);
			if((i+1)%5==0) {
				System.out.println();
			 }else {
				 System.out.print(", ");
			 }
			
		}
		
	}

}
