package by.htp.les03.logic;

/*Заданы координаты трех вершин треугольника (x1, y1),(x2, y2),(x3, y3).
Найти его периметр и площадь.*/

public class Task13 {
	
	public static void task13() {
		
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		
		x1 = 5;
		x2 = 7;
		x3 = 12;
		y1 = 5;
		y2 = 15;
		y3 = 10;
		
		double area = Math.abs(((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2);
		
		double a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		double perim = Math.abs(a + b + c);
		
		System.out.println("Периметр треугольника равен " + perim);
		System.out.println("Площадь треугольника равна " + area);
		
		
	}

}
