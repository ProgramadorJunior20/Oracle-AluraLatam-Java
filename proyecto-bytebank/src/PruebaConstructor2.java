
public class PruebaConstructor2 {

	public static void main(String[] args) {
		Carro carro = new Carro(2013, "Gol", 35000.0);
		Carro otroCarro = new Carro("Civic", 0);
		
		
		
		System.out.println(carro.getAnnio());
		System.out.println(carro.getModelo());
		System.out.println(carro.getPrecio() + "\n");
		
		//otroCarro
		
		System.out.println(otroCarro.getAnnio());
		System.out.println(otroCarro.getModelo());
		System.out.println(otroCarro.getPrecio());
	}

}
