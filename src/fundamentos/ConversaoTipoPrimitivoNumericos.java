package fundamentos;

class ConversaoTipoPrimitivoNumericos {

	public static void main(String[] args) {
		
		double a = 1; //impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345678888; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicita (CAST)
		System.out.println(d);
	
		double e = 1.999999;
		int f = (int) (e);  // explicita (CAST)
		System.out.println(f);
	}
	
}
