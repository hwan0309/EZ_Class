package sec07;

public class AssignExam {

	public static void main(String[] args) {
		 
	int result = 0;
	result += 10;
	System.out.println(result); //10
	
	result -=5;
	System.out.println(result); //10 - 5 
	
	result *= 3;
	System.out.println(result); //5 * 3
	
	result /=5;
	System.out.println(result); // 15 / 5
	
	result %=3;
	System.out.println(result); // 3 % 3 
	
	
	int score = 85;
	char grade = ((score >= 90) ? 'A' : ((score >= 80)) ? 'b' : 'c'); //���׿������� Ǯ��
	System.out.println(score + "���� " + grade + "����Դϴ�.");
	
	}

}
