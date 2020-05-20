package by.htp.les03.logic;

/*Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
часы через р ч q мин r с?*/

public class Task32 {
	
	public static void task32() {
		
		double t = 12;
		double n = 25;
		double k = 8;
		
		double p = 5;
		double q = 45;
		double r = 58;
		
		
		double second = (k + r) % 60;
		double minute = (((k + r) - second) / 60 + n + q) % 60;
		double hour = (((k + r) - second) / 60 + n + q) / 60 + t + p;
		hour = (int)hour;
				
		System.out.println("Часы будут показывать " + hour + " часов " + minute + " минут " + second + " секунд.");
		
		
	}

}
