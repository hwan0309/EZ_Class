package sec02;

public class Switch01Exam {

	public static void main(String[] args) {	
		char grade = 'B';
		switch(grade) {
		case 'A':	//break���� �ʰ� A,a Ȯ��
		case 'a':
			System.out.println("����� ȸ���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;			
		default:
			System.out.println("�մ��Դϴ�.");
		}
	
		}
		
		
	}


