package by.htp.les03.logic;

//����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r).


public class Task23 {

	public static void task23() {
		
		double r = 2;
		double R = 3;
		
		double area = (Math.PI * Math.pow(R, 2)) - (Math.PI * Math.pow(r, 2));
		
		System.out.println("������� ������ ���������� " + area);
	}
	
}
