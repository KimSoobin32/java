
public class While1 {

	public static void main(String[] args) {
		int a = 1;	//while ���۰�
		while(a<11) {	//while ������ (���ᰪ)
//			System.out.print(a+",");
			a++;	//���� or ����
		}
		
		int b = 10;
		while(b>=5) {
//			System.out.print(b+",");
			b--;
		}
		
		/* ���빮��
		 * ���� ������ while������ �ۼ�
		 * 22~16���� ���ڸ� ��� 
		 */
		int c = 22;
		while(c>15) {
//			System.out.print(c+",");
			c--;
		}
		
		int aa = 1;	//�ʱⰪ
		int bb = 10;	//���ᰪ
		while(aa<=bb) {	//�ݺ��� ����
//			System.out.printf("%d, ",aa);
			aa++;	//����
		}
		
		
		/* ���빮��
		 * ���� 2���� �̿��Ͽ� ������ �°� ���� ���
		 *  99~47���� ���
		 */
		int cc = 99;
		int dd = 47;
		while(cc>=dd) {
			System.out.print(cc+",");
			cc--;
		}
		
	}

}
