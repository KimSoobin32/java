
public class If_for2 {

	public static void main(String[] args) {
		//1~100���� ���� �� 80 �̻��� ���ڸ� ���
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80) {
//				System.out.print(f+" ");
			}
		}
		
		//200~300���� ���� �� 240 ������ ���ڸ� ���
		int ff;
		for(ff=200;ff<=300;ff++) {
			if(ff<=240) {
//				System.out.print(ff+" ");
			}
		}
		
		//3�� ����� ���
		final int a = 3;
		int w;
		for(w=1;w<11;w++) {
			if(w%a == 0) {
//				System.out.printf("%d ",w);
			}
		}
		
		/*
		 * ���빮��: ������ �� 2���� �ݺ�.
		 * ��, 2�� ����� �� 10 ���� ū ���ڸ� ���
		 */
		int n;
		final int g = 2;
		int r;
		for(n=1;n<=9;n++) {
			r = g * n;
			if(r>10) {
//				System.out.print(r+" ");
			}		
		}
		
		/*
		 * ���빮��
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ� ���� (9����)
		 * 18 36 54 72
		 */
		int aa;
		final int gg = 9;
		int rr;
		for(aa=1;aa<=9;aa++) {
			if(aa%2==0) {
				rr = gg * aa;
//				System.out.print(rr+" ");
			}			
						
		}
		
		/*
		 * ���빮��
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ� ����, ��� ������ x
		 * 1~20 ������ ����
		 * 6 14 17 19
		 */
		int n1;
		for(n1=1;n1<=20;n1++) {
			if(n1 == 6 || n1 == 14 || n1 == 17 || n1 == 19) {
				System.out.print(n1+" ");
			}
			
		}
		
		
		
		
	}

}
