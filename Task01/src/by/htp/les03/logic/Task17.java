package by.htp.les03.logic;

/*���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� ��������������
������� ���� �����.*/

public class Task17 {
	
	public static void task17() {
		
		double a = 28;
		double b  = 12;
		
		double rezArithmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		double rezGeometry = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("������� �������������� ����� " + rezArithmetic);
		System.out.println("������� �������������� ����� " + rezGeometry);
	}

}
