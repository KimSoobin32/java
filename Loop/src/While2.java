
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		while(a<10) {
			c = b * a;	//�������
//			System.out.print(c+",");
			a++;	//�������� ��ġ �߿� , ��ġ�� ���� �� �޶���
		}
		
		/*
		 * ���빮��
		 * �ش� ������� Ȯ���Ͽ� �ݺ������� �ڵ带 �ۼ�
		 * 56,49,42,35,28,21,
		 */

		int n1 = 8;
		int n2 = 7;
		int n3;
		while(n1>=3) {
			n3 = n1 * n2;
			System.out.print(n3+",");
			n1--;
		}
		
		System.out.println("");
//		
//		int aa = 0;
//		int bb = 7;
//		int cc;
//		while(aa<6) {
//			cc = 56 - bb * aa;
//			System.out.print(cc+",");
//			aa++;
//		}
		
		/*
		 * ���빮��2.
		 * ���� ��� ���� Ȯ�� �Ͻ� �� �ش� ������� �´� �ڵ带 �ۼ�
		 * 4,7,10,13,16,19,22,
		 * 
		 */
		int dd = 0;
		int ee = 3;
		int ans;
		while(dd<=6) {
			ans = 4 + ee * dd;
			System.out.print(ans+",");
			dd++;
		}
				

		
	}

}
