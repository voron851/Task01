package by.htp.les03.logic;

// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения

public class Task30 {
	
	public static void task30() {
		
		double R1 = 500;
		double R2 = 400;		
		double R3 = 300;
		
		double Rez = 1 / (1 / R1 + 1 / R2 + 1 / R3);
		
		System.out.println("Сопротивление соединения равно " + Rez + " Ом");
		
		
	}

}
