package by.htp.les03.logic;

//Ќайти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

public class Task29 {

	public static void task29() {
		
		double a = 3;
		double b = 5;
		double c = 7;
		
		double cosA = (a * a + c * c - b * b) / (2 * a * c);
		double cosB = (a * a + b * b - c * c) / (2 * a * b);
		double cosC = (b * b + c * c - a * a) / (2 * c * b);
		
		double radianA = Math.acos(cosA);
		double radianB = Math.acos(cosB);
		double radianC = Math.acos(cosC);
		
		System.out.println("”гол A в радианах равен " + radianA);
		System.out.println("”гол B в радианах равен " + radianB);
		System.out.println("”гол C в радианах равен " + radianC);
		
		double degreeA = Math.toDegrees(radianA);
		double degreeB = Math.toDegrees(radianB);
		double degreeC = Math.toDegrees(radianC);
		
		System.out.println("”гол A в градусах равен " + degreeA);
		System.out.println("”гол B в градусах равен " + degreeB);
		System.out.println("”гол C в градусах равен " + degreeC);
		
		
		
		
		
	}
}
