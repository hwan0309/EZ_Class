package next0103;

public class SingleOpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = -100;
//		x = -x;
//		System.out.println("x : " + x );
//		
//		byte b = 100;
//		///byte y = -b; ������ ���� -��ȣ�� �����̱⿡ ����� int�� ��ȯ
//		
//		int y = -b;
//		System.out.println("y : " + y);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x : " + x); //x = 12;
		System.out.println("----------------------");
		
		y--;
		--y;
		System.out.println("y : " + y);
		System.out.println("----------------------");
		
		z = ++x + y++;  //x�� 1�� ������ /1�� ������ x�� y�� ������  /������ ���� z�� �Էµ�/ y�� 1�� ������
		System.out.println("z : " +z);
		System.out.println("x : " +x);
		System.out.println("y : " +y);
		System.out.println("----------------------");
		
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
	int result1 = v1 + v2;
	System.out.println("v1 + v2 : " + result1);  //10 + 2 = 14
	
	long result2 = v1 + v2 - v4;
	System.out.println("v1 + v2 - v4 : " + result2); //10 + 4 -10 = 4

	
	double result3 = (double)v1 / v2;
	System.out.println("v1/v2" + result3);	//10 / 4 = 2
	
	int result4 = v1 % v2;
	System.out.println("v1 % v2 : " + result4); // 10 % 4 = 2
	}

}
