package by.htp.les03.logic;

//����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.

public class Task29 {

	public static void task29() {
		
		double a = 3;
		double b = 5;
		double c = 7;
		
		double cosA = (a * a + c * c - b * b) / (2 * a * c);
		double cosB = (a * a + b * b - c * c) / (2 * a * b);
		double cosC = (b * b + c * c - a * a) / (2 * c * b);
		
		double radianA = Math.acos(cosA);
		double radianB = Math.acos(cosB);
		double radianC = Math.acos(cosC);
		
		System.out.println("���� A � �������� ����� " + radianA);
		System.out.println("���� B � �������� ����� " + radianB);
		System.out.println("���� C � �������� ����� " + radianC);
		
		double degreeA = Math.toDegrees(radianA);
		double degreeB = Math.toDegrees(radianB);
		double degreeC = Math.toDegrees(radianC);
		
		System.out.println("���� A � �������� ����� " + degreeA);
		System.out.println("���� B � �������� ����� " + degreeB);
		System.out.println("���� C � �������� ����� " + degreeC);
		
		
		
		
		
	}
}
