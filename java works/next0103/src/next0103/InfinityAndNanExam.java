package next0103;

import java.util.Scanner;

public class InfinityAndNanExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x�� ���� ���ڸ� �Է��Ͻÿ�.");
		int x = sc.nextInt();
		
		

		System.out.println("y�� ���� ���ڸ� �Է��Ͻÿ�.");
		double y = sc.nextDouble();
		double z = x/y;
//		System.out.println(z);
		
		//����ó��
		if(Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("���� ����� �� ����");
		}else {
			System.out.println(z + 2);
		}
	
	}

}
