
public class For_plus {

	public static void main(String[] args) {
		/*
		 * 1~10���� ��� ���ڸ� ���� ������� ���
		 */
		int f;
		int total = 0;
		for(f=1;f<11;f++) {	//total�������� �ݺ����� ���������� ������Ŵ
			//total = total + f;
			total += f;
		}
		System.out.println("���հ�: "+total);
		
		//+=(���ϱ��Ҵ��ȣ), -=(�����Ҵ��ȣ), *=(���ϱ��Ҵ�), /=(�������Ҵ�)
		// b = b - f; -> b -= f;
		
		/*
		 * ���빮��
		 * ��ü���� 500�� �ֽ��ϴ�.
		 * �� 8ȸ ���� �ݺ��Ǹ鼭 �ѹ� �ݺ��Ҷ����� 12�� �����ϵ��� �Ͽ� ���� ���� ���
		 * ����� 404
		 */
		int a;
		int ans = 500;
		int n = 12;
		for(a=1;a<=8;a++) {
			ans = ans - n;
		}
		System.out.println(ans);
		
		/*
		 * ���빮��
		 * ������ 2�� 2*1 ~ 2*9�� �� �հ踦 ���
		 * ���� �հ� 90
		 */
		int b;
		int g = 2;	//��
		int r;	//��
		int h = 0;	//��
		for(b=1;b<10;b++) {
			r = g * b;
			h = h + r;			
		}
		System.out.println(h);

	}

}
