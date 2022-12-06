public class EjemploSwitch {

    public static void main (String[] args) {

        int mac = 200;
        
        switch (mac) {
		case 2000:
			if (mac == 2000) {
				System.out.println("A heste precio consigues la mac");
			}
			break;

		default:
			System.out.println("Ingresaste un precio incorrecto");
			break;
		}

       
    }
}
