package next0214;

public class SplitExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		      String board = "1, �ڹ� �н�, ���� Ÿ�� String�� �����մϴ�., ��ö��";
		      //��ǥ�� �������� ���ڸ� �и�
		      String[] tks = board.split(",");
		      
		      //�ε����� �о����
		      System.out.println("��ȣ : " + tks[0]);
		      System.out.println("���� : " + tks[1]);
		      System.out.println("���� : " + tks[2]);
		      System.out.println("�̸� : " + tks[3]);
		      System.out.println("+++++++++++++++++");
		      System.out.println("");
		      
		      
		      //for���� �̿��Ͽ� ���
		      //length length() ���� �����ϱ�.
		      for(int i = 0; i<tks.length; i++) {
		         System.out.println(tks[i]);
		      }
		      
		      //�迭 ����� ����
		      int[] arr1 = new int[3];
		      
		      //�ʱⰪ�� ���õ�
		      for(int i = 0; i<3; i++) {
		         System.out.print(arr1[i] + ", ");
		      }
		      System.out.println("++++++++++++++++++++");
		      arr1[0] = 20;
		      arr1[1] = 40;
		      for(int i = 0; i<3; i++) {
		         System.out.print(arr1[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      
		      double[] num = new double[5];
		      for(int i = 0; i<5; i++) {
		         System.out.print(num[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      num[0] = 1.123;
		      num[2] = 3.12;
		      for(int i =0; i<5; i++) {
		         System.out.print(num[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      String[] arr3 = new String[4];
		      for(int i = 0; i<4; i++) {
		         System.out.print(arr3[i] + ", ");
		      }
		      System.out.println();
		      System.out.println("++++++++++++++++++++");
		      arr3[0] = "��";
		      arr3[1] = "����";
		      arr3[2] = "����";
		      arr3[3] = "�ܿ�";
		      for(int i = 0; i<arr3.length; i++) {
		         System.out.print(arr3[i] + ", ");

		      }
		   }


		   }
		
