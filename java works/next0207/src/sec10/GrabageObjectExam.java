package sec10;

public class GrabageObjectExam {

	public static void main(String[] args) {
		
		String hobby = "����"; 	//�������� "����"�̶�� ��ü�� �����ǰ� �ּҰ� hobby�� �Ҵ�
		hobby = null; 	//"����"�̶�� String ��ü�� �����Ⱑ ��
		
		String bestCar ="����Ƽ��";
		String worstCar = bestCar; //bestCar�� ����� ��ü ������ WorstCar�� ����	
		bestCar = null; 	//worstCar�� null�� ������ó�� ���� �ʾұ⿡ ��°���
		
	}

}
