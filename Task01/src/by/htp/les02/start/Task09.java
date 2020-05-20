package by.htp.les02.start;

//вычислить значение выражения по формуле

public class Task09 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		double rez;
		
		a = 7;
		b = 8;
		c = 2;
		d = 4;
		
		rez = a / c + b / d - (a * b - c) / (c * d);
		
		System.out.println("Значение выражения равно " + rez);

	}

}
