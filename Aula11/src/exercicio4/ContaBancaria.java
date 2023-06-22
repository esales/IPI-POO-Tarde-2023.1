package exercicio4;

public class ContaBancaria {
	private String numero;
	private double saldo;
	
	public ContaBancaria(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado: " + valor);
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}