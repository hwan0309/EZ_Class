package next0102;

public class CastingExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteVal1 = 10;
		byte byteVal2 = 20;
		//byte rs = byteVal1 + byteVal2;   ������ ����
		int rs = byteVal1 + byteVal2;
		System.out.println(rs);
		
		char charVal1 = 'A';
		char charVal2 = '1';
		//char charVal3 = charVal1 + charVal2;   �����Ͽ���
		int charVal3 = charVal1 + charVal2;
		System.out.println("�����ڵ�� " + charVal3);
		System.out.println("��¹��ڴ� " + (char) charVal3);
		
		int intVal3 = 10;
		int intVal4 = 4;
		double intVal5 = intVal3 / intVal4;
		//������ �ڵ���ȯ double
		System.out.println(intVal5);
		
		
	}
}
