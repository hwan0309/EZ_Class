package next0215;

public class Student {
	// �ʵ� - ��ü�� �����Ͱ� ����Ǵ� ��
	int age;
	int grade;
	String name;
	
	// ������ - Student() {} - ��ü ���� �� �ʱ�ȭ ���� ���
	Student(int age,String name, int grade){
	this.age = age;
	this.name = name;
	this.grade = grade;
	}
	//method ��ü�� �������� ȣ�� �� ����Ǵ� ��
	public void study() {
		System.out.println("student");
	}
	public void home() {
		System.out.println("go home");
	}
}
