package sec06;

public class BitLogExam {

	public static void main(String[] args) {
		 
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("---------------------");
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "(������ " + v1);
		System.out.println(toBinaryString(v1) + "(������ " + v2);
		System.out.println(toBinaryString(v1) + "(������ " + v3);
	}
		
		
		public static String toBinaryString(int num) {
			String str = Integer.toBinaryString(num);  //������ 2�� ���ڿ��� ��ȯ���ִ� �żҵ�
			while(str.length() < 32) {
				str = "0" + str;
			}
			return str;
			
		}
}

