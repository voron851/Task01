package by.htp.les03.logic;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {
	
	public static void main (String[] args) {
		
		double M = 217;
		double N = 8;
		
		double rez = M / N;
		
		double whole = (int) rez;
		double fractional = rez - whole;
		
		System.out.println(rez);
		System.out.println(whole);
		System.out.println(fractional);
		
		double x = whole % 10;
		double y = (int)(fractional * 10);
		
		
		System.out.println(x + " " + y);
		
	}

}
