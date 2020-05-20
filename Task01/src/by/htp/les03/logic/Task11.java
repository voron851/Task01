package by.htp.les03.logic;

//Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов.

public class Task11 {
	
	public static void task11(){
		
		double a;
		double b;
		
		double perim;
		double area;
		
		a = 4;
		b = 10;
		
		area = a * b / 2;
		
		perim = Math.sqrt(a * a + b * b) + a + b;
		
		System.out.println("Площадь треугольника равна " + area);
		System.out.println("Периметр треугольника равен " + perim);
	}

}
