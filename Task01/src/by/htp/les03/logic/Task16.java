package by.htp.les03.logic;

//����� ������������ ����� ��������� ��������������� �����

public class Task16 {
	
	public static void task16() {
		
		int x = 4571;
		
		int a = x % 10;
		x = x / 10;
		int b = x % 10;
		x = x / 10;
		int c = x % 10;
		x = x / 10;
		int d = x;
		
		int rez = a * b * c * d;
		System.out.println("������������ ����� ��������� ��������������� ����� ����� " + rez);
		
	}

}
