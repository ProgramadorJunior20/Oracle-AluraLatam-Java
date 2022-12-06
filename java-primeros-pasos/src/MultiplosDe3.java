
public class MultiplosDe3 {

	public static void main(String[] args) {
		
		// Multiplos de 3 
		int multiplo = 3;
		
		for (int numero = 0; numero <= 100; numero++) {
			if (numero % multiplo == 0) {
				System.out.println("Multiplos de " + multiplo + " = " + numero);
			}
		}
		
		// for (int i = 3; i < 100; i += 3 ){
			// Segunda alternativa
           // System.out.println(i);
        // }
	}

}
