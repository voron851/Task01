package by.htp.les03.logic;

/*���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc.*/

public class Task22 {

	public static void task22() {

		int T = 183254;
		int Minutes = T / 60;
		int Mod_Sec = T % 60;
		int Hours = Minutes / 60;
		int Mod_Min = Minutes % 60;

		System.out.println(Hours + "� " + Mod_Min + "��� " + Mod_Sec + "�");
	}

}
