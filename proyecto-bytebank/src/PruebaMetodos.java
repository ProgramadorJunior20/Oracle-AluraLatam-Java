
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(1);
		miCuenta.getSaldo();
	
		miCuenta.depositar(300);
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta(2);
		cuentaDeJimena.depositar(1000);
		
		boolean puedeTransferir = cuentaDeJimena.transferir(200, miCuenta);
		
		System.out.println(puedeTransferir);
		
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
			System.out.println("Cuenta de Jimena: " + cuentaDeJimena.getSaldo() + " Soles");
			System.out.println("Mi Cuenta: " + miCuenta.getSaldo() + " Soles");
		} else {
			System.out.println("Transferencia Fallida");
		}
		
	}

}
