package fundamentos.operadores;

public class Relacionai {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);    // iqual
		System.out.println(3 > 4);     // maior
		System.out.println(3 >= 3);    // maior iqual
		System.out.println(3 < 7);     // menor
		System.out.println(30 <= 7);   // menor iqual
		System.out.println(30 != 4);   // diferente
		
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
