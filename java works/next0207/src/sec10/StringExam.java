package sec10;

public class StringExam {

	public static void main(String[] args) {
		
		String name1 = "hong";
		String name2 = "hong";
		String name3 = new String("hong");
		
		System.out.println(name3);
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2);
		System.out.println(name2 == name3);
		System.out.println(name1 == name3); // 3���� new String�� ���� �Ǿ��� ������ 1���� 2���� ���� �ǹ̰� �ƴ�
		
		System.out.println(name1.equals(name3));
	}

}
