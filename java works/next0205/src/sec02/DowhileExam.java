package sec02;

import java.util.Scanner;

public class DowhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��Ͻÿ�.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			
		}while( !inputString.equals("q"));
			System.out.println("power off");
	}

}


