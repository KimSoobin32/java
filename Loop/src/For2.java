
public class For2 {

	public static void main(String[] args) {
		int a;	//for�� �ʱⰪ
		int b = 2;	//���꿡 ����� ����
		int c;	//������ ����� ���
		for(a=1; a<=9; a++) {
			c = b * a;	//������� �۾�
			System.out.print(c+",");	//����� ������� ���
			
		}
		System.out.println();
		/* ���빮�� 
		 * ���� ������� ���� �ڵ带 �ۼ�
		 * 45,40,35,30,25,20,
		 * 
		 */
		int d;	//for ������
		int e = 5;	//5�����
		int f;	//��갪
		for(d=9; d>=4; d--) {
			f = d * e;
			System.out.print(f+",");
		}
		System.out.println();
		
//		int n1;
//		int n2 = 5;
//		int ans;
//		for(n1=0; n1<=5; n1++) {
//			ans = 45 - n2 * n1;
//			System.out.print(ans+",");
//		}
		
		/* ���빮�� 
		 * ���� ������� Ȯ�� �� �ڵ带 �����Ͽ� ���
		 * 
		 * 11,22,33,44,55,66,77,88,99,
		 * 
		 */
		int g;
		int h = 11;
		int i;
		for(g=1; g<=9; g++) {
			i = g * h;
			System.out.print(i+",");
		}
		System.out.println();
		
		//���2
		int z;	//for
		int x;	//�����
		for(z=1;z<10;z++) {
			x = (10 * z) + z;
			System.out.print(x+",");
		}

	}

}
