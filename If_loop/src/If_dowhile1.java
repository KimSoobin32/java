
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * ���빮��: ������ 6�� �߿��� 35�̻� ��� ���ڸ� ���
		 */
		int a = 1;
		int g = 6;
		int r;
		do {
			r = g * a;
			if(r>=35) {
//				System.out.printf("%d ",r);
			}		
			a++;
		}while(a<=9);
		
		/*
		 * ���빮��
		 * 14~27���� ���� �� ¦�� ���� ��� ���Ͽ�
		 * ���� ������� ���, ���: 140
		 */
		int b = 14;
		int h = 0;
		do {
			if(b%2==0) {
				h = h + b;
			}			
			b++;
		}while(b<=27);
		System.out.println(h);
	}

}
