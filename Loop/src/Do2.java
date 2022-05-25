
public class Do2 {

	public static void main(String[] args) {
		
		int a = 1;	//반복문 기초값
		int b = 9;	//산술 고정값
		int c;	//선언은 밖에서 해야 메모리 효율 좋음
		do {
			c = a * b;
//			System.out.print(c+" ");
			a++;
		}while(a<10);
		
		/*
		 * 응용문제
		 * 다음 결과값을 보고 do~while문으로 코드를 작성
		 * 35 45 55 65 75
		 * 
		 */
		//시작값이나 종료값에 결과값 쓰지 않도록 주의
		int n1 = 3;
		int n3;
		do {
			n3 =  (n1 * 10) + 5;
			System.out.print(n3+" ");
			n1++;
		}while(n1<=7);

	}

}
