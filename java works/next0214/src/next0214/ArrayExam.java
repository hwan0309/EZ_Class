package next0214;

public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] members = new String[2];
		
		members[0] = "ö��";
		members[1] = "����";
		
		for(int i = 0; i < 2; i++) {
			System.out.println("������ :" + members[i]);
		}
		
		members[2] = "����";		
		members[3] = "�μ�";
		//������ ���� �̹� new String�� 2�� �迭�� ���� �� �ְ� �Է��߱⶧����
		for(int i = 0; i < 2; i++) {
			System.out.println("������ :" + members[i]); 	
		
		}		
		
	}
}
