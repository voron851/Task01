package by.htp.les03.logic;

// ����� ������� ������������ ������ � �������� ���� ��������������� �����.

public class Task36 {

	public static void task36() {

		int x = 2538;
		int temp = 1;
		int chet = 0;
		int nechet = 0;
		
		
		while (temp > 0) {

			temp = x % 10;
			
			if(temp % 2 == 0) {
				chet = chet + temp;
			}
			if(temp % 2 != 0) {
				nechet = nechet + temp;
			}
			
			x = x / 10;

		}
		
		System.out.println("����� ������ ����� ����� " + chet);
		System.out.println("����� �������� ����� ����� " + nechet);

	}
}
