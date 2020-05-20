package by.htp.les03.logic;

/* —оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость в сто€чей воде v км/ч, скорость
течени€ реки v1 км/ч, врем€ движени€ по озеру t1 ч, а против течени€ реки Ч t2 ч.*/


public class Task31 {
	
	public static void task31() {
		
		double v = 25;
		double v1 = 10;
		double t1 = 5;
		double t2 = 3;
		
		double distance = (v * t1) + (v1 - v) * t2;
		
		System.out.println("ѕуть пройденный лодкой составл€ет " + distance + "км.");
	}

}
