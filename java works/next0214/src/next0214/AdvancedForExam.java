package next0214;

public class AdvancedForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {95, 71, 35, 69, 77, 88, 15};
		
		//�迭�� ��
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;		
		}
		System.out.println(sum);
		
		//��հ�  (�Ҽ��� �ڸ����� ������ �ϱ����� double type�� ���� ��ȯ)
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}

}
