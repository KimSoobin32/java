
public class If_for {

	public static void main(String[] args) {
		final int a = 1;	
		//final을 사용 시 변수에서 상수로 변경
		//상수 : 절대 변하지 않는 수
		final String name = "홍길동";
		//name = "이순신"; -> 불가
		
		System.out.println(a);
		System.out.println(name);
		
		final int ct = 5;	//고정값
		int f;	//반복문
		boolean ok = false;	//조건에대한 true, false
		for(f=1;f<11;f++) {
			if(f == ct) {	//반복문 값과 고정 값이 같을 경우
				System.out.println("등록된 값이 확인 됩니다.");
				ok = true;	//조건에대한 값을 변경
			}
		}
		if(ok == false) {	//만약 반복문이 끝났는데도 반복문 안에 조건 사항이 없을 경우 출력되는 코드
			System.out.println("확인이 되지 않는 숫자입니다.");
		}
		
		/*
		 * 총 20번의 값을 반복.
		 * 짝수 따로, 홀수 따로 출력
		 */
		int ff;
		String odd = "";	//odd:홀수, even:짝수
		for(ff=1;ff<=20;ff++) {
			if(ff % 2 != 1) {
				System.out.print(ff+" ");
			} else {	//만약에 홀수 값일 경우 odd변수에 지속적으로 값을 추가
				odd = odd + ff + " ";	//추가할 경우 " "빈 공간을 활용하여 적용
			}
		}
		System.out.println(odd);

	}

}
