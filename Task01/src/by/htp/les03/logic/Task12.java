package by.htp.les03.logic;

//¬ычислить рассто€ние между двум€ точками с данными координатами (x1,y1) и (x2, y2)

public class Task12 {

	public static void task12() {
						
		int x1;
		int x2;
		int y1;
		int y2;
		
		x1 = 7;
		x2 = 25;
		y1 = 2;
		y2 = 15;
		
		int a = x2 - x1;
		int b = y2 - y1;
		double rez = Math.sqrt(a * a + b * b);
		
		System.out.println("–ассто€ние между точками равно " + rez);
		

	}

}
