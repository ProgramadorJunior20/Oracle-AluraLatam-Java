
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeJefferson = new Cuenta(3);
		Cliente titular = cuentaDeJefferson.getTitular();
		titular.setNombre("Jeggesn");
		
		System.out.println(titular.getNombre());
	}
}
