
public class ProgramaConBreak {

    public static void main(String args[]) {
    	
    	// Anidación de bucles de repetición 
        for(int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= 5; columna++) {
                if ( columna > fila ) {
                    break;
                }
                System.out.print( columna );
            }
            System.out.println();
        }

    }

}
