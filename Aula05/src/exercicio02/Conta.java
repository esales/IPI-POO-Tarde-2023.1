package exercicio02;

public class Conta {
	double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	void depositar(double valor) {
		saldo += valor;
	}
	
	void sacar(double valor) {
		saldo -= valor;
	}
	
	void exibirSaldo() {
		System.out.println(saldo);
	}

}
