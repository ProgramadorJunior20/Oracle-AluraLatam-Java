// entidad Cuenta:
class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	// Los constructores se utilizan para inicializar los atributos
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("No de se permiten 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}

	// Este Metodo no retorna valor
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// Este Metodo retorna un valor booleano
	public boolean retirar(double valor) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}

	// Metodo para obtener un valor a una variable pribada
	public double getSaldo() {
		return this.saldo;
	}

	// Metodo para asignar un valor a una variable pribada
	//public void setAgencia(int agencia) {
	//	if (agencia > 0) {
	//		this.agencia = agencia;
	//	} else {
	//		System.out.println("Agencia no permite numeros negativos");
	//	}
	//}

	// Getter de setAgencia para obtener el avalor asignado
	public int getAgencia() {
		return agencia;
	}

	// setter de Cliente titular
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	// Getter de Cliente titular
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}

	// Getters y Setters
	// public String getNombre() {
	// return this.nombre;
	// }

	// public String getMatricula() {
	// return this.matricula;
	// }

	// public void setMatricula(String matricula) {
	// this.matricula = matricula;
	// }

	// public void setNombre(String nombre) {
	// this.nombre = nombre;
	// }
}
