package by.htp.les03.logic;

/*Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое
модулей этих чисел.*/

public class Task17 {
	
	public static void task17() {
		
		double a = 28;
		double b  = 12;
		
		double rezArithmetic = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		double rezGeometry = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое равно " + rezArithmetic);
		System.out.println("Среднее геометрическое равно " + rezGeometry);
	}

}
