package next0220;

public class Television {
		
		static String company = "LG"; //�����ʵ�� �ٷ� �ʱ�ȭ ����
		static String model = "OLED";
		static String info;	//������� �����
		static {
		info = company + "/" + model; 
		}
		
		int pay = 2000000;
		String color;
		
		void method1(int getpay) {	//�ν��Ͻ� �޼ҵ�
			this.pay = getpay;
			this.color = "red";
			System.out.println(this.pay + "/" + this.color);
		}
		
		static void method2() {	//�����޼ҵ�
			System.out.println(info);
		}
	}

