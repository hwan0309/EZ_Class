package next0220;

public class Car {
	static int speed;	//�ν��Ͻ� �ʵ� ����
	
	static void run() {	//�ν��Ͻ� �޼ҵ� ����
		System.out.println(speed+"ing");
	}
	
	static void simulate() {
		Car myCar = new Car();	//��ü ����
		
		myCar.speed = 200;	//�ν��Ͻ� �ɹ� ���
		myCar.run();
	}
	public static void main(String[] args) {	
		
		simulate();
		Car myCar = new Car();
		myCar.speed = 50;
		myCar.run();
	}
}
