package next0216;
public class Ex1 {
	
	//�ʵ�
	String company = "hyundai car";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Ex1
	(String model){
		this.model = model;
	}
	Ex1
	(String model, String color){
		this.model = model;
		this.color = color;
	}
	Ex1
	(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
