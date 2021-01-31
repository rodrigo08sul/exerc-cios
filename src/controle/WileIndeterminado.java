package controle;

import java.util.Scanner;

public class WileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			entrada.hasNextLine();
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}
}
