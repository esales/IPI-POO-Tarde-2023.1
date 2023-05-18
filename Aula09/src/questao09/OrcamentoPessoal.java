package questao09;

public class OrcamentoPessoal {
	private double saldo;
	
	public OrcamentoPessoal(double saldo) {
		this.saldo = saldo;
	}
	
	public void retirarValor(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void inserirValor(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void imprimirSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}

	
	
	
	
	
	
	
	
}