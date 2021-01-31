package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		 
		a++;  // a = a + 1
		a--;  // a = a - 1
		 
		++b;  // b = b + 1;
		--b;  // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("mini Desafio...");
		System.out.println(++a == b--); // precedencia primeiro encrementa 
		System.out.println(a);  //"+1 no a" que vale 1 ai 1+1 e 2  
		System.out.println(b);  //ai comparar comparar com o "b que vale 2" 
	//ai so depois que faz o decremente, depois do decremento ai b vale 1
	}
}
