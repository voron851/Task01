package by.htp.les02.start;

//вычислить значение выражения по формуле

public class Task10 {

	public static void main(String[] args) {
		
		double sinX;
		double sinY;
		double cosX;
		double cosY;
		double tgXY;
		
		
		double rez;
		
		sinX = Math.sin(25);
		sinY = Math.sin(4);
		tgXY = Math.tan(25 * 4);
		cosX = Math.cos(25);
		cosY = Math.cos(4);
		
		rez = (sinX + cosY) / (cosX - sinY) * tgXY;
		System.out.println("Значение выражения равно " + rez);

	}

}
