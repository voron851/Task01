package by.htp.les03.logic;

//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Task14 {
	
	public static void task14() {
		
		double radius = 7.5;
		
		double perim = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Длина окружности равна " + perim);
		System.out.println("Площадь круга равна " + area);
		
		
		
	}

}
