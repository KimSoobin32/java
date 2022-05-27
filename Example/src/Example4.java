
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제4
		 * 다음 결과값에 맞춰서 코드 출력
		 * 해당 코드는 for문으로 작성
		 * 45 35 25 15 10
		 */
//		int a;
//		int g = 5;
//		for(a=9;a>=2;a--) {
////			System.out.println(a);
//			if(a%2==1) {
//				System.out.print(g*a+" ");
//			} else if(a==2) {
//				System.out.print(g*a+" ");
//			}
//		}
		
		int f;
		int v;
		for(f=9;f>0;f--) {
			v = 5 * f;
			if(f%2==1 || f == 2) {
				if(f != 1) {
					System.out.print(v+" ");
				}				
			}			
		}
		System.out.println("");
		int f1;
		int v1;
		for(f1=9;f1>0;f1--) {
			v1 = 5 * f1;
			if(f1%2==1 && f1 != 1 || f1==2) {	//홀수이고 1이아니거나, 2이거나
				System.out.print(v1+" ");								
			}			
		}
		

	}

}
