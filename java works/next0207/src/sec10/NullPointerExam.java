package sec10;

public class NullPointerExam {

	public static void main(String[] args) {
		
		int[] num = null;
		//num[0] = 20;
		String str = null;	//null�϶��� ��� �ؾ��ұ�		
		System.out.println("�� ������ ����" + str.length() + "�Դϴ�.");
		
		String str2= "Hong";
		str2 = "kim";
		str2 = null;
		
	}

}
