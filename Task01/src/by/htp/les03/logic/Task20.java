package by.htp.les03.logic;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20 {
	
	public static void task20() {
		
		double L = 17;
		
		double area = Math.pow(L, 2) / (4 * Math.PI);
		
		System.out.println("Площадь круга равна " + area);
	}

}
