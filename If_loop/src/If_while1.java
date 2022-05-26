
public class If_while1 {

	public static void main(String[] args) {
		/*
		 * 응용문제:  while문으로 10~30까지 숫자 중에서
		 * 20보다 큰 홀수 값만 출력
		 */
		int a = 10;
		while (a <= 30) {			
			if (a % 2 == 1 && a > 20) {			
				System.out.printf("%d ", a);				
			}		
			a++;
		}
		System.out.println("");
		//카운터 값으로 갯수 파악하기
		/*
		 * 1~10까지 숫자 중에 짝수 값이 몇개 있는지 갯수 출력
		 */
		int ww = 1;
		int count = 0;	//카운터 변수값 0
		while(ww<=10) {
			
			if(ww%2==0) {	//짝수일 경우
				count++;	//해당 조건이 맞을 경우 +1씩 증가
			}
			
			ww++;
		}
		//반복문 종료 시 초종 카운터 값 출력
		System.out.println("1~10까지 숫자 중 짝수 갯수는: "+count);
		
		

	}

}
