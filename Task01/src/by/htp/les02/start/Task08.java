package by.htp.les02.start;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Task08 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		a = 2;
		b = 7;
		c = 4;
		
		double rez;
		
		rez = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println("Значение функции равно " + rez);

	}

}
