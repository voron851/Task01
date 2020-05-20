package by.htp.les03.logic;

/*Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
информации.*/


public class Task34 {
	
	public static void task34() {
		
		double A = 657856;
		
		double rez = A / 1024;
		
		System.out.println(A + " байт ровняется " + rez + " килобайтам.");
	}

}
