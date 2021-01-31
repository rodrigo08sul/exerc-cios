package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
//wrapper são a versão objeto dos tipos primitivos!
		int a = 12345678;
		System.out.println(a);
	}
}
