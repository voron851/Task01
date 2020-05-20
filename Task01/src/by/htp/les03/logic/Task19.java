package by.htp.les03.logic;

/*Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту,
радиусы вписанной и описанной окружностей*/

public class Task19 {
	
	public static void task19() {
		
		double a = 12.5;
		
		double area = Math.pow(a, 2) * Math.sqrt(3) / 4;
		double h = Math.sqrt(3) / 2 * a;
		double r = Math.sqrt(3) / 6 * a;
		double R = Math.sqrt(3) / 3 * a;
		
		
		System.out.println("Площадь треугольника равна " + area);
		System.out.println("Высота треугольника равна " + h);
		System.out.println("Радиус вписанной окружности равен  " + r);
		System.out.println("Радиус описанной окружности равен " + R);
		
		
		
	}

}
