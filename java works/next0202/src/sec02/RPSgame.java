package sec02;

import java.util.Scanner;

public class RPSgame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int com = ((int)Math.random()*3); //3���� ���� ���� ������	
		System.out.println("rock, scissors, paper insert random number");
			String user = in.nextLine();	
			
			
			//3�� Ǯ��
			if(user.equals("scissors")) {
				userInt = 0;
			}else if(user.equals("rock")) {
				userInt = 1;
			}else {
				userInt = 2;
			}
			
				int com = (int)(Math.random()*3);	
				
				if(com == 0 && userInt == 1) {
					System.out.println("user win");
				}else if(com == 0 && userInt == 2) {
					System.out.println("com win");
				}else if(com == 1 && userInt == 0) {
					System.out.println("com win");
				}else if(com == 1 && userInt == 2) {
					System.out.println("user win");
				}else if(com == 2 && userInt == 0) {
					System.out.println("user win");
				}else if(com == 2 && userInt == 1) {
					System.out.println("com win");
				}else {
					System.out.println("tie regame ");
				}
	}
}

		
		//1��Ǯ��
//		int user_input = sc.nextByte();
//		int com_input = sc.nextByte();
//		
//		System.out.println("0 , 1, 2 �� �Է��Ͻÿ�");
//		
//		//int user_input(0);
//		if(user_input == 0 && com_input == 0) {
//			System.out.println("�����ϴ�");
//		}else if(user_input == 0 && com_input == 1) {
//			System.out.println("���� ��");
//		}else {
//			System.out.println("��ǻ�� ��");
//		}
//		
//		//int user_input(1); 
//		if(user_input == 1 && com_input == 1) {
//			System.out.println("��ǻ�� ��");
//		}else if(user_input == 1 && com_input == 1) {
//			System.out.println("�����ϴ�");
//		}else {
//			System.out.println("���� ��");
//		}
//		
//		//int user_input(2);
//		if(user_input == 2 && com_input == 2) {
//			System.out.println("���� ��");
//		}else if(user_input == 2 && com_input == 1) {
//			System.out.println("��ǻ�� ��");
//		}else {
//			System.out.println("�����ϴ�");
//		}	
//		
//		2�� Ǯ��
//		//public static void main(String[] args) {
//		// Getting input from the user
//		Scanner scanner = new Scanner(System.in);
//        
//		System.out.println("Make a move! (rock/paper/scissors)");
//		String playerMove = scanner.nextLine();
//      
//		// Getting input from the computer
//		Random random = new Random();
//		int randomNumber = random.nextInt(3);
//        
//		String computerMove;
//		if (randomNumber == 0) {
//			computerMove = "rock";
//		} else if (randomNumber == 1) {
//			computerMove = "paper";
//		} else {
//        computerMove = "scissors";
//		}
//		System.out.println("Computer chose " + computerMove + "!");
//  
//		// Print results
//		if (playerMove.equals(computerMove)) {
//        System.out.println("It's a draw!");
//		} else if (playerWins(playerMove, computerMove)) {
//        System.out.println("Player wins!");
//		} else {
//        System.out.println("Computer wins!");
//		}
  





