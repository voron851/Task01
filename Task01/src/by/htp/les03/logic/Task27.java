package by.htp.les03.logic;

/*Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8
за три операции и а10 за четыре операции.*/

public class Task27 {
	
	public static void task27() {
		
		int a = 2;
		
		int b = a * a;
		int c = b * b;
		int a8 = c * c;
		
		
		System.out.println(a8);
		
		int a10 = a8 * b;
		
		System.out.println(a10);
	}

}
