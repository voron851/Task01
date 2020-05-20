package by.htp.les03.logic;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Task18 {
	
	public static void task18() {
		
		double a = 12.2;
		
		double area1 = a * a;
		
		double areaFull = area1 * 6;
		
		double capacity = area1 * a;
		
		System.out.println("Площадь грани равна " + area1);
		System.out.println("Площадь полной поверхности равна " + areaFull);
		System.out.println("Объем куба равен " + capacity);
	}

}
