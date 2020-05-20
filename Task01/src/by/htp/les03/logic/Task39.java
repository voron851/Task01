package by.htp.les03.logic;

/* ƒано действительное число х. Ќе пользу€сь никакими другими арифметическими операци€ми, кроме умножени€,
сложени€ и вычитани€, вычислите за минимальное число операций: 2x4- 3х3 + 4х2- 5х + 6 */


public class Task39 {
	
	public static void task39() {
	
	int x = 2;
	
	int y = x * x;
	
	int rez = 2 * y * y - 3 * x * y + 4 * y - 5 * x + 6;
	
	System.out.println(rez);
	

	}
}
