
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��4
		 * ���� ������� ���缭 �ڵ� ���
		 * �ش� �ڵ�� for������ �ۼ�
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
			if(f1%2==1 && f1 != 1 || f1==2) {	//Ȧ���̰� 1�̾ƴϰų�, 2�̰ų�
				System.out.print(v1+" ");								
			}			
		}
		

	}

}
