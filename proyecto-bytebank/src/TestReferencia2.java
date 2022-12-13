
public class TestReferencia2 {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNombre("Jefferson");
		cliente.setDocumento("1005.679.230");
		cliente.setTelefono("+57 320-687-9109"); ;
		
		System.out.println("Clase ciente" + " " + cliente.getNombre());
		
		Cuenta cuentaDeJefferson = new Cuenta(1);
		// Referenciando Clases
		cuentaDeJefferson.setTitular(cliente);
		
		System.out.println("Nombre Titular:" + " " + cuentaDeJefferson.getTitular().getNombre());
		System.out.println("Documento Titular:" + " " + cuentaDeJefferson.getTitular().getDocumento());
		System.out.println("Telefono Titular:" + " " + cuentaDeJefferson.getTitular().getTelefono());
				
	}
}
