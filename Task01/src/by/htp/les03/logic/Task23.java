package by.htp.les03.logic;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).


public class Task23 {

	public static void task23() {
		
		double r = 2;
		double R = 3;
		
		double area = (Math.PI * Math.pow(R, 2)) - (Math.PI * Math.pow(r, 2));
		
		System.out.println("Площадь кольца составляет " + area);
	}
	
}
