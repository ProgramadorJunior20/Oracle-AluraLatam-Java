
public class EjemploScope {

	public static void main(String[] args) {

		// System.out.println("Hello World");

		int edad = 18;
		int cantidadPersonas = 2;

		// boolean esPareja = cantidadPersonas > 1;
		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		boolean puedeEntrar = edad >= 18 && esPareja;

		// System.out.println("El valor de condición es: " + puedeEntrar);

		if (puedeEntrar) {
			System.out.println("Sea bienvenido");
		} else {
			System.out.println("Usted no esta permitido a " + "entrar");
		}

	}

}
