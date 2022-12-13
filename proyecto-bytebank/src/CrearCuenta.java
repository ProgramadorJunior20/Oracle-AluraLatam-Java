
public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1);
		//primeraCuenta.setAgencia(22);
		primeraCuenta.depositar(1000);
		primeraCuenta.getSaldo();
		// primeraCuenta.pais = "Colombia"; No Compila

		System.out.println("Valor de la variable del objeto primeraCuenta: " + primeraCuenta.getSaldo());

		Cuenta segundaCuenta = new Cuenta(2);
		segundaCuenta.depositar(1000);
		segundaCuenta.getSaldo();
		
		System.out.println("segundaCuenta" + segundaCuenta.getSaldo());
		System.out.println("agencia" + " " + primeraCuenta.getAgencia());
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		}else {
			System.out.println("No apunta a el mismo objeto");
		}
	}
}
