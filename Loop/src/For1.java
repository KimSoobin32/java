
public class For1 {

	public static void main(String[] args) {
		// �ݺ��� : �����͸� �ϰ������� �Է�, ����� �� �� �ֵ��� �ϴ� ����		

//		int z = 1;
		//for���� �յ� +,- �Ű� �Ƚᵵ ��
		// z++; //+1 ���� : ��� �� +1����
		// z--; //-1 ���� : ��� �� -1����
		// ++z; //+1 ���� : +1���� �� ���
		// --z; //-1 ���� : -1���� �� ���
//		System.out.println(z);

		
		for(int a=0; a<10; a++) {	// for(�ʱⰪ;������;�����Ǵ°���)			
//			System.out.println(a);			
		}
		
		int b;
		for(b=5; b<=10; b++) {
//			System.out.println(b);
		}
		
		//10~4 ��������
		int c;
		for(c=10; c>3; c--) {	//���ǻ��� c<3 : 0~�������� ���� ���������� ��Ȳ�� �߻�
//			System.out.println(c);
		}
		
		//���빮��  20~27���� ���
		short n;
		for(n=20; n<28; n++) {
//			System.out.print(n);
		}
		
		//���빮�� 39~21���� ���
		byte n1;
		for(n1=39; n1>20; n1--) {
//			System.out.print(n1+" ");
		}
		
		//1~10���� ���� ���
		int aa;
		int bb = 10;
		for(aa=1; aa<=bb; aa++) {
//			System.out.print(aa+",");
		}
		
		/*
		 * ���빮�� ���� 2���� �̿��Ͽ� ���� �����͸� ���
		 * 55~4���� ��� (��������)
		 */
		byte cc;
		byte dd = 4;
		for(cc=55; cc>=dd-1; cc--) {
			System.out.print(cc+",");
		}

	}

}
