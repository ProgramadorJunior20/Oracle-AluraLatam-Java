
public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1); // Instancia de una cuenta
		Cuenta cuenta2 = new Cuenta(2);
		Cuenta cuenta3 = new Cuenta(3);
		
		System.out.println(Cuenta.getTotal());
	}
}
