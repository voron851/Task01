package by.htp.les03.logic;

//����� ������� ������������, ��� ������� �������� ����� � � b, � ���� ����� ����� ��������� �.

public class Task26 {
	
	public static void task26() {
		
		double a = 12;
		double b = 8;
		double inDegrees = 38;
		double inRadians = Math.toRadians(inDegrees);
		
		double area = (a * b * Math.sin(inRadians)) / 2;
				
		System.out.println("������� ������������ ����� " + area);
	}

}
