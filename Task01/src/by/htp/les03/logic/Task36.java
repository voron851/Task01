package by.htp.les03.logic;

// Найти частное произведений четных и нечетных цифр четырехзначного числа.

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
		
		System.out.println("Сумма четных чисел равна " + chet);
		System.out.println("Сумма нечетных чисел равна " + nechet);

	}
}
