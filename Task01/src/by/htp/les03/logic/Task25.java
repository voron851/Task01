package by.htp.les03.logic;

/*Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен).*/

public class Task25 {
	
	public static void task25() {
		
		double a = 4;
		double b = 12;
		double c = 6;
		
		double D = Math.pow(b, 2) - (4 * a * c);
				
		double rez1 = (- b + Math.sqrt(D)) / (2 * a);
		
		double rez2 = (- b - Math.sqrt(D)) / (2 * a);
		
		System.out.println("Корни квадратного уравнения равны " + rez1 +" и " + rez2);
		
		
	}

}
