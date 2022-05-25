
public class For1 {

	public static void main(String[] args) {
		// 반복문 : 데이터를 일괄적으로 입력, 출력을 할 수 있도록 하는 문법		

//		int z = 1;
		//for문은 앞뒤 +,- 신경 안써도 됨
		// z++; //+1 증가 : 출력 후 +1증가
		// z--; //-1 감소 : 출력 후 -1감소
		// ++z; //+1 증가 : +1증가 후 출력
		// --z; //-1 감소 : -1감소 후 출력
//		System.out.println(z);

		
		for(int a=0; a<10; a++) {	// for(초기값;범위값;증가또는감소)			
//			System.out.println(a);			
		}
		
		int b;
		for(b=5; b<=10; b++) {
//			System.out.println(b);
		}
		
		//10~4 내림차순
		int c;
		for(c=10; c>3; c--) {	//주의사항 c<3 : 0~음수까지 전부 찍혀버리는 상황이 발생
//			System.out.println(c);
		}
		
		//응용문제  20~27까지 출력
		short n;
		for(n=20; n<28; n++) {
//			System.out.print(n);
		}
		
		//응용문제 39~21까지 출력
		byte n1;
		for(n1=39; n1>20; n1--) {
//			System.out.print(n1+" ");
		}
		
		//1~10까지 숫자 출력
		int aa;
		int bb = 10;
		for(aa=1; aa<=bb; aa++) {
//			System.out.print(aa+",");
		}
		
		/*
		 * 응용문제 변수 2개를 이용하여 다음 데이터를 출력
		 * 55~4까지 출력 (내림차순)
		 */
		byte cc;
		byte dd = 4;
		for(cc=55; cc>=dd-1; cc--) {
			System.out.print(cc+",");
		}

	}

}
