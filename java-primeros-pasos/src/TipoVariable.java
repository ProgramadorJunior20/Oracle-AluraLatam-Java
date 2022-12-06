
public class TipoVariable {
	
	public static void main(String[] args) {
		
		// De decimal a entero
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; // Cast
		System.out.println("A entero " + variable1Entero);
		
		long prueba = 12222222222222l;
		
		int resultado = ( int ) variable1 + variable1Entero;
		System.out.println("Resultado " + resultado);
		
	}
}
