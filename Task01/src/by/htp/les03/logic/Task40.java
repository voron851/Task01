package by.htp.les03.logic;

// ���� �������� �. �������� �������� -2� + 3�2- 4�3 � 1 + 2� + 3�2 + 4�3. ������������ �� �������� ��������

public class Task40 {
	
	public static void task40() {
		
		int x = 2;
		
		int y = x * x;
		int z = 4 * x * y;
		//int n = 2 * x + 3 * y;
		
		int rez1 = -2 * x + 3 * y - z;
		
		int rez2 = 1 + 2 * x + 3 * y + z;
		
		System.out.println(rez1);
		System.out.println(rez2);
		
	}

}
