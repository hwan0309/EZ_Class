package sec08;

import java.util.Scanner;

public class MybankExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bmoney = 0;
		boolean run = true;
		while(run) {
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("���ϴ� �޴��� ��ȣ�� �����Ͻÿ�");
			System.out.println("1.���� | 2.����� | 3.�ܰ�Ȯ�� | 4.����");
			System.out.println("++++++++++++++++++++++++++++++++++");
			System.out.println("���� >");
			String sec = sc.nextLine();
			int num = Integer.parseInt(sec); //String type ->  Integer type
			switch(num) {
			case 1:
				System.out.println("���ݾ� >");
				bmoney += Integer.parseInt(sc.nextLine());
				break;
				
			case 2:
				System.out.println("Ǯ�ݾ� >");
				int newMoney = bmoney;
				newMoney -= Integer.parseInt(sc.nextLine());
				if(newMoney < 0) {
					System.out.println("�ܱ��� �����ϴ�.");
					break;
				}else {
					bmoney = newMoney;
				}
				break;
				
			case 3:
				System.out.println("�ܰ� >");
				System.out.println(bmoney);
				break;
				
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.print("");
	}

}
