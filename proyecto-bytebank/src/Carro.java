
public class Carro {
	
	private int annio;
	private String modelo;
	private double precio;
	
	public Carro(int annio, String modelo, double precio) {
		
		if ( annio >= 1891 ) {
			this.annio = annio;
		} else {
			System.out.println("El año informado no es valido. por eso usaremos 2017!");
			this.annio = 2017;
		}
		
		if ( modelo != null ) {
			this.modelo = modelo;
		}else {
			System.out.println("El modelo no fue informado. por eso usaremos Gol!");
			this.modelo = "Gol";
		}
		
		if ( precio > 0 ) {
			this.precio = precio;
		}else {
			System.out.println("El precio no es valido. Por eso usaremos 40000.0!");
			this.precio = 40000.0;
		}
		
	}
	
	public Carro(String modelo, double precio) {
		// Reutizamos el primer constructor con this
		this(2017, modelo, precio);
		
		// this.annio = 2017;
		
		//if ( modelo != null ) {
		//	this.modelo = modelo;
		//}else {
		//	System.out.println("El modelo no fue informado. por eso usaremos Gol!");
		//	this.modelo = "Gol";
		//}
		
		//if ( precio > 0 ) {
		//	this.precio = precio;
		//}else {
		//	System.out.println("El precio no es valido. Por eso usaremos 40000.0!");
		//	this.precio = 40000.0;
		//}
		
	}
	
	public int getAnnio() {
		return annio;
	}
	public void setAnnio(int annio) {
		this.annio = annio;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
