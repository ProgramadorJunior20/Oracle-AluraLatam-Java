
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nombre = "Jefferson";
		cliente.documeto = "1005.679.230";
		cliente.telefono = "+57 320-687-9109";
		
		Cuenta cuentaDeJefferson = new Cuenta();
		cuentaDeJefferson.agencia = 1;
		// Referenciando Clases
		cuentaDeJefferson.titular = cliente;
		
		System.out.println("Nombre Titular:" + " " + cuentaDeJefferson.titular.nombre);
		System.out.println("Documento Titular:" + " " + cuentaDeJefferson.titular.documeto);
		System.out.println("Telefono Titular:" + " " + cuentaDeJefferson.titular.telefono);
				
	}
}
