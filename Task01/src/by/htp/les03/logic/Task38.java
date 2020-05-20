package by.htp.les03.logic;

/*ƒл€ данных областей составить линейную программу, котора€ печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false Ч в противном случае*/

public class Task38 {

	public static void task38_1() {

		int x0 = 0; // координаты точки
		int y0 = 0;

		int x1 = -5; // координаты треугольника
		int y1 = -5;
		int x2 = -2;
		int y2 = 10;
		int x3 = 15;
		int y3 = 2;

		boolean rez = false;

		int a = (x1 - x0) * (y2 - y1) - (x2 - x1) * (y1 - y0);
		int b = (x2 - x0) * (y3 - y2) - (x3 - x2) * (y2 - y0);
		int c = (x3 - x0) * (y1 - y3) - (x1 - x3) * (y3 - y0);

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			rez = true;
		}

		System.out.println("“очка с координатами (х, у) принадлежит закрашенной области - " + rez);
	}

	public static void task38_2() {

		double x0 = -4; // координаты точки
		double y0 = -11;

		double x1 = -5; // координаты верхнего пр€моугольника (выше ’)
		double y1 = 0;
		double x2 = -5;
		double y2 = 10;
		double x3 = 5;
		double y3 = 10;
		double x4 = 5;
		double y4 = 0;

		double m1 = 0; // координаты верхнего пр€моугольника (ниже ’)
		double n1 = -8;
		double m2 = 0;
		double n2 = 8;
		double m3 = -10;
		double n3 = -8;
		double m4 = -10;
		double n4 = 8;

		boolean rez = false;

		if (x0 >= x1 && x0 <= x3 && y0 <= y2 && y0 >= y1 || x0 >= n1 && x0 <= n2 && y0 >= m3 && y0 <= m1) {
			rez = true;
		}

		System.out.println("“очка с координатами (х, у) принадлежит закрашенной области - " + rez);
	}

	public static void task38_3() {

		double x1 = 4;
		double y1 = 4;
		double x2 = 5;
		double y2 = -5;

		double x0 = 2;
		double y0 = -1;

		boolean rez = false;

		if (x0 >=  0 && x0 <= x1 && y0 >= 0 && y0 <= y1 || x0 >=  0 && x0 <= x2 && y0 <= 0 && y0 >= y2) {
			rez = true;
		}

		System.out.println("“очка с координатами (х, у) принадлежит закрашенной области - " + rez);

	}

}
