package sec06;

public class TestExam {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if(charCode >= 65) {
			System.out.println("charCode�� �빮�� �Դϴ�.");
		}else {
			System.out.println("charCode�� �빮�ڰ� �ƴմϴ�.");
		}
		if(charCode > 97 && charCode < 122) {
			System.out.println("charCode�� �ҹ��� �Դϴ�.");
		}else {
			System.out.println("charCode�� �ҹ��ڰ� �ƴմϴ�.");
		}
		if(charCode > 48 && charCode < 97) {
			System.out.println("charCode�� ���� �Դϴ�.");
		}else {
			System.out.println("charCode�� ���ڰ� �ƴմϴ�.");
		}
		

	}

}
