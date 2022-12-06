// entidad Cuenta:
class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;

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
}
