package by.htp.les03.logic;

// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.

public class Task33 {
	
	public static void main(String[] args) {
		
		char a = '%';
		
		int number = (int) a;
					
		char b = (char) (a + 1);
		char c = (char) (a - 1);
		
		System.out.println("Порядковый номер символа " + a + " равен " + number + ". Предыдущий и последующий символы " + c + " и " + b + " соответственно.");
				
		
	}

}
