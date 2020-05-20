package by.htp.les03.logic;

/*��������� �������� ���������, ���������� �������� true, ���� ��������� ������������ �������� ��������, �
false � � ��������� ������:
�1 ����� ����� N �������� ������ ���������� ������.
�2 ����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����.
�3 ����� ���� ������� ������������ ����� N �������� ������ ������.
�4 ����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�).
�5 ������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.
�6 ����������� �� ��������� �,b,� �������� ��������������.
�7 ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����.
�8 �������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4).
�9 ������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, �).*/

public class Task37 {

	public static void task37_1() {

		int N = 79;
		boolean x = false;

		if (N % 2 == 0 && N / 100 <= 0) {
			x = true;
		}

		System.out.println("����� ����� N �������� ������ ���������� ������ - " + x);

	}

	public static void task37_2() {

		int N = 0312;
		boolean x = false;

		int summ1 = 0;
		int summ2 = 0;

		summ1 = N % 10;
		N = N / 10;
		summ1 = summ1 + N % 10;
		N = N / 10;

		summ2 = N % 10;
		N = N / 10;
		summ2 = summ2 + N % 10;

		if (summ1 == summ2) {
			x = true;
		}

		System.out.println(
				"����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ���� - " + x);

	}

	public static void task37_3() {

		int N = 466;
		int summ = 0;
		boolean x = false;

		summ = N % 10;
		N = N / 10;
		summ = summ + N % 10;
		N = N / 10;
		summ = summ + N % 10;

		if (summ % 2 == 0) {
			x = true;
		}

		System.out.println("����� ���� ������� ������������ ����� N �������� ������ ������ - " + x);
	}

	public static void task37_4() {

		int x = 26;
		// int y = 8; - �� �����, �.�. �� ������������ � �������
		int t = 10;
		int n = 25;
		boolean rez = false;

		if (x >= t && x <= n) {
			rez = true;
		}

		System.out.println(
				"����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�) - "
						+ rez);
	}

	public static void task37_5() {

		int N = 753;

		boolean rez = false;
		int square = N * N;

		double rez2 = N % 10;
		int N2 = N / 10;
		rez2 = rez2 + (rez2 % 10);
		N2 = N2 / 10;
		rez2 = Math.pow((rez2 + (rez2 % 10)), 3);

		if (square == rez2) {
			rez = true;
		}

		System.out.println("������� ��������� ������������ ����� " + N + " ����� ���� ����� ���� ����� ����� - " + rez);
	}

	public static void task37_6() {

		int a = 5;
		int b = 6;
		int c = 5;
		boolean rez = false;

		if (a == b && b == c && a == c) {
			rez = true;
		}

		System.out.println("����������� �� ��������� �,b,� �������� �������������� - " + rez);
	}

	public static void task37_7() {

		int N = 415;

		int a = N % 10;
		N = N / 10;
		int b = N % 10;
		N = N / 10;
		int c = N % 10;
		boolean rez = false;

		if (a + b == c || a + c == b || b + c == a) {
			rez = true;
		}

		System.out.println(
				"����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� ����� - " + rez);
	}

	public static void task37_8() {

		int N = 48;

		int a = 2;

		boolean rez = false;

		if (N % a == 0) {
			rez = true;
		}

		System.out.println("�������� ����� " + N + " �������� �������� ����� " + a + " - " + rez);
	}

	public static void task37_9() {

		double a = 2;
		double b = 3;
		double c = 4;
		double x = 8;
		double y = 284;

		
		double rez = Math.pow((a * x), 2) + b * x + c;
		boolean rez2 = false;

		if (rez == y) {
			rez2 = true;
		}

		System.out.println("������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, �) - " + rez2);
	}

}
