package next0215;

public class CarExam {

	public static void main(String[] args) {
		
	//car ��ü�ҷ�����
	Car	myCar = new Car();
	System.out.println("Model " + myCar.model);
	System.out.println(myCar.start);
	System.out.println(myCar.speed);
	
	//car ��ü�� �ʵ尪 ����
	myCar.speed = 60;
	System.out.println(myCar.speed);
	}

}
