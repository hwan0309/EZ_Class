package sec02;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		int num =(int)(Math.random()*6) +1;		//random ���� 6���� ������ �� 0���� �����̱⿡ +1 �Է�
		System.out.println("��ǻ�Ͱ� ������ �ֻ��� ���� �˾Ƹ��纸�ÿ�");
		int userNum = sc.nextInt();
		if(num == userNum) {
			System.out.println("�����Դϴ�.");
			break;	//�����̸� break�� ���� ���α׷� ����
	}
	}
		System.out.println("���α׷� ����");
		sc.close();
	}	
}
