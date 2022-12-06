
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
	
		miCuenta.depositar(300);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(1000);
		
		boolean puedeTransferir = cuentaDeJimena.transferir(200, miCuenta);
		
		System.out.println(puedeTransferir);
		
		if (puedeTransferir) {
			System.out.println("Transferencia Exitosa");
			System.out.println("Cuenta de Jimena: " + cuentaDeJimena.saldo + " Soles");
			System.out.println("Mi Cuenta: " + miCuenta.saldo + " Soles");
		} else {
			System.out.println("Transferencia Fallida");
		}
		
	}

}
