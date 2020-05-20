package by.htp.les03.logic;

//Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

public class Task24 {
	
	public static void task24() {
		
		double a = 25;
		double b = 12;
		double angle = 38;
		
		double rez = (a * a - b * b) / 2 * Math.tan(angle);
		
		System.out.println("Площадь трапеции равна " + rez);
	}

}
