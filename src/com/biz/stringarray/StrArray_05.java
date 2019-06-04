package com.biz.stringarray;

public class StrArray_05 {

	public static void main(String[] args) {

		String strName = "홍길동이몽룡성춘향";
		String[] strNames = strName.split("");
		
		
		//문자열.split("")매서드는
		//문자열(변수)에 담긴 문자열들을
		//한글자씩 분해해서
		//문자열 개수만큼의 배열을 생성해준다.
		for(int i=0; i< strNames.length;i++) {
			System.out.println(strNames[i]);		
		}
	
		int intNum =10;
		int intNum2 = intNum + 100;
		
	}
	//makeString이라는 매서드에 형태만 만들고
	// 내부의 구체적인 기능은 작성하지 않은 상태
	//이런 코드를 proto type이라고 한다.
	//보통 프로토 타입을 만들었을 때
	//void형이 아닌 경우에 리턴문을 만들어야 하는데
	//리턴형이 숫자이면 return 0이라고 작성하고
	//그 외의 형일 경우에 리턴 null이라도 작성한다.
	public static String[] makeString(String strNations) {
		return null;
		
	}
}
