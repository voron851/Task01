package by.htp.les03.logic;

//��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.

public class Task28 {
	public static void task28() {
		
		double radian = 3;
		
		int degree;
		int minute;
		int second;
		
		
		double rez = 180 / Math.PI * radian;
		System.out.println(rez);
		
		degree = (int) rez;
		System.out.println(degree);
		
		minute = (int)((rez - degree) * 60);
		System.out.println(minute);
		
		second = (int)(((rez - degree) * 60 - minute) * 60);
		System.out.println(second);
		
		System.out.println(radian + " ������� - ��� " + degree + " ������ " + minute + " ������ " + second + " ������.");
	}

}
