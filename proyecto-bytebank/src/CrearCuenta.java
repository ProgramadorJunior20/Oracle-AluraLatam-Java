
public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 1000;
		// primeraCuenta.pais = "Colombia"; No Compila

		System.out.println("Valor de la variable del objeto: " + primeraCuenta.saldo);

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 1000;
		
		System.out.println(segundaCuenta.saldo);
		System.out.println(primeraCuenta.agencia);
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}else {
			System.out.println("No apunta a el mismo objeto");
		}
	}
}
