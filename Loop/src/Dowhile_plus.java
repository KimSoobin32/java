
public class Dowhile_plus {

	public static void main(String[] args) {
		/*
		 * do~while : 30~35���� �հ踦 ���
		 */
		int a = 30;
		int h = 0;
		do {
			h = h + a;
			a++;
		}while(a<=35);
		System.out.println(h);
		
		/*
		 * ���빮�� �հ���� 189�� �ִ�. �� 1~10���� �հ�ġ��
		 * ���� 189���� �� ���հ踦 ���, ��� 134
		 */
//		int b = 1;
//		int n = 189;
//		int h1 = 0;
//		do {
//			h1 = h1 + b;
//			b++;
//		}while(b<11);
//		System.out.println(n - h1);
		
		int ww = 1;
		int total = 189;
		do {
			total -= ww;	//total = total - ww;
			ww++;
		}while(ww<=10);
		System.out.println("�����: "+total);

	}

}
