package by.htp.les03.logic;

//��������� �������� � ������� �������������� ������������ �� ������ a � b ���� �������.

public class Task11 {
	
	public static void task11(){
		
		double a;
		double b;
		
		double perim;
		double area;
		
		a = 4;
		b = 10;
		
		area = a * b / 2;
		
		perim = Math.sqrt(a * a + b * b) + a + b;
		
		System.out.println("������� ������������ ����� " + area);
		System.out.println("�������� ������������ ����� " + perim);
	}

}
