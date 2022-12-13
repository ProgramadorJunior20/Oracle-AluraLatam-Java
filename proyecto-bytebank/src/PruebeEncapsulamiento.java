
public class PruebeEncapsulamiento {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		cliente.setNombre("Jefferson");
		cliente.setDocumento("ewewwreer1212121");
		
		// Referencia de cuenta a cliente
		cuenta.setTitular(cliente);
		
		// Referencia desde clase cliente a clase cuenta
		Cliente titular = cuenta.getTitular();
		titular.setTelefono("12121212121");
		
		
		System.out.println("Class cliente: " + " " + cliente);
		System.out.println("Class cliente: " + " " + cliente);
		System.out.println("Class cuenta: " + " " + cuenta.getTitular());
		
		// ¿Apuntan en la misma direccion de referencia?
		// System.out.println(cuenta);
		// System.out.println(cliente);
		
	}

}
