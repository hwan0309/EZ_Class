package next0214;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, 
		//���̰� 3�� �迭�� ����
		String[] oldStrArr = {"Java", "Javascript", "Mysql"};
		//���̰� 5�� �迭�� ����
		String[] newStrArr = new String[5];
		
		//���̰� 3�ι迭�� �׸��� 5�ι迭�� �����
		//oldStrArr�� 0��°���� newStrArr�� 0��°�� ����
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i = 0; i < newStrArr.length; i++) {
			System.out.println(newStrArr[i]);
		}
	}

}
