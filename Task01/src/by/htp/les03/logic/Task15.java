package by.htp.les03.logic;

//Написать программу, которая выводит на экран первые четыре степени числа Пи.

public class Task15 {
	
	public static void task15() {
		
		double degree1 = Math.PI;
		double degree2 = Math.pow(Math.PI, 2);
		double degree3 = Math.pow(Math.PI, 3);
		double degree4 = Math.pow(Math.PI, 4);
		
		System.out.println("Первая степень числа Пи равна " + degree1);
		System.out.println("Вторая степень числа Пи равна " + degree2);
		System.out.println("Третья степень числа Пи равна " + degree3);
		System.out.println("Четвертая степень числа Пи равна " + degree4);
		
	}

}
