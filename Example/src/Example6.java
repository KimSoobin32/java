
public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮��6
		 * 1~10���� ���������� �����ϴ� �ݺ���
		 * ��, 1~5������ ��� ���� ���ϰ�, 6~10������ ��� ���� ����
		 * �ش� �ΰ��� ���� ���Ͽ� ���� ���� ū��, ���Ѱ��� ū����
		 * ����� ���
		 */
		
		int a = 1;
		int h = 0;	//���Ұ�
		int g = 1;	//���Ұ�
		while(a<=10) {
			if(a<=5) {
				g = g * a;				
			}else {
				h = h + a;
			}
			a++;
		}
		System.out.println("��: "+g);
		System.out.println("��: "+h);
		if(g>h) {
			System.out.println("���Ѱ��� ũ��.");
		} else if(g<h) {
			System.out.println("���Ѱ��� ũ��.");
		} else {
			System.out.println("�� �񱳰��� ����.");
		}
		
	}

}
