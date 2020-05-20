package by.htp.les02.start;

// Даны два действительных числа x и y. Вычислить их сумму, разность, произведение и частное.

public class Task01 {

	public static void main(String[] args) {
		double x;
		double y;
		
		x = 5;
		y = 7;
		
		double rez1 = x + y;
		
		double rez2 = x - y;
		
		double rez3 = x * y;
		
		double rez4 = x / y;
		
		System.out.println("Сумма x + y равна " + rez1);
		
		System.out.println("Разность x - y равна " + rez2);
		
		System.out.println("Произведение x * y равно " + rez3);
		
		System.out.println("Частное x / y равно " + rez4);

	}

}
