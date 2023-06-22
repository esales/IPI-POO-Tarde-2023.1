package exercicio4;

public class ContaPoupanca extends ContaBancaria {
	private double taxaRendimento;

	public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
		super(numero, saldo);
		this.taxaRendimento = taxaRendimento;
	}
	
	public void calcularRendimento() {
		double saldo = this.getSaldo();
		double taxa = this.taxaRendimento/100;
		
		System.out.println("Rendimento: " +saldo * taxa);
	}
}