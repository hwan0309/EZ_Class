package next0215;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student(20,"kim",2);
		System.out.println("s1 ������ Student ��ü�� �����Ѵ�");
		
		System.out.println(s1.age);
		System.out.println(s1.grade);
		System.out.println(s1.name);
		
		s1.study();
		s1.home();
	}

}
