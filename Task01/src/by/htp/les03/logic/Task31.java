package by.htp.les03.logic;

/* ��������� ��������� ��� ���������� ����, ����������� ������, ���� �� �������� � ������� ���� v ��/�, ��������
������� ���� v1 ��/�, ����� �������� �� ����� t1 �, � ������ ������� ���� � t2 �.*/


public class Task31 {
	
	public static void task31() {
		
		double v = 25;
		double v1 = 10;
		double t1 = 5;
		double t2 = 3;
		
		double distance = (v * t1) + (v1 - v) * t2;
		
		System.out.println("���� ���������� ������ ���������� " + distance + "��.");
	}

}
