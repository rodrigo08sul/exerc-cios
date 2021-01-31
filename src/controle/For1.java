package controle;

public class For1 {

	public static void main(String[] args) {
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		System.out.println("esse modelo de for não é utilizada________________________________");
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
	}
}
