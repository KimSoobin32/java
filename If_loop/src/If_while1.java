
public class If_while1 {

	public static void main(String[] args) {
		/*
		 * ���빮��:  while������ 10~30���� ���� �߿���
		 * 20���� ū Ȧ�� ���� ���
		 */
		int a = 10;
		while (a <= 30) {			
			if (a % 2 == 1 && a > 20) {			
				System.out.printf("%d ", a);				
			}		
			a++;
		}
		System.out.println("");
		//ī���� ������ ���� �ľ��ϱ�
		/*
		 * 1~10���� ���� �߿� ¦�� ���� � �ִ��� ���� ���
		 */
		int ww = 1;
		int count = 0;	//ī���� ������ 0
		while(ww<=10) {
			
			if(ww%2==0) {	//¦���� ���
				count++;	//�ش� ������ ���� ��� +1�� ����
			}
			
			ww++;
		}
		//�ݺ��� ���� �� ���� ī���� �� ���
		System.out.println("1~10���� ���� �� ¦�� ������: "+count);
		
		

	}

}
