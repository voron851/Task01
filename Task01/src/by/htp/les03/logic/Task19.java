package by.htp.les03.logic;

/*���� ������� ��������������� ������������. ����� ������� ����� ������������, ��� ������,
������� ��������� � ��������� �����������*/

public class Task19 {
	
	public static void task19() {
		
		double a = 12.5;
		
		double area = Math.pow(a, 2) * Math.sqrt(3) / 4;
		double h = Math.sqrt(3) / 2 * a;
		double r = Math.sqrt(3) / 6 * a;
		double R = Math.sqrt(3) / 3 * a;
		
		
		System.out.println("������� ������������ ����� " + area);
		System.out.println("������ ������������ ����� " + h);
		System.out.println("������ ��������� ���������� �����  " + r);
		System.out.println("������ ��������� ���������� ����� " + R);
		
		
		
	}

}
