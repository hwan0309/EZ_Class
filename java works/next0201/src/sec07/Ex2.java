package sec07;

public class Ex2 {

	public static void main(String[] args) {
	
		
		//1��
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //y�� --�� �ڿ� �ֱ⿡ z���� �� �������� ����
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		//2��
		int score = 85;
		String result = (!(score > 90))? "��" : "��";
		System.out.println(result);
		
		//3��
		int pencils = 534;
		int students = 30;	
		//�л� �Ѹ��� ������ ���� ��
		double pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);		
		//���� ���� ��
		double pencilsLeft = (students % pencils);
		System.out.println(pencilsLeft);
		
		//4��
		int value = 365;
		System.out.println(value - 65);
		
		//5��
		
		//6��
		int x2= 10;
		int y2 = 5;
		System.out.println( (x2 > 7) && (y2 <= 5) );
		System.out.println( (x2 % 3 == 2) && (y2 % 2 != 1) );
		
		//7��
		double x3 = 5.0;
		double y3 = 0.0;
		double z3 = 5 % y;
		
		if(Double.isNaN(z3)) {		
			System.out.println("0.0���� ���� �� �����ϴ�");		
	}else {
		double result1 = z3 + 10;
		System.out.println("��� : " + result1);
	}
	
	}
		}
	


