package by.htp.les03.logic;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class Task22 {

	public static void task22() {

		int T = 183254;
		int Minutes = T / 60;
		int Mod_Sec = T % 60;
		int Hours = Minutes / 60;
		int Mod_Min = Minutes % 60;

		System.out.println(Hours + "ч " + Mod_Min + "мин " + Mod_Sec + "с");
	}

}
