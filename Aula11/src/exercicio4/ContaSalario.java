package exercicio4;

public class ContaSalario extends ContaBancaria {

	public ContaSalario(String numero, double saldo) {
		super(numero, saldo);
	}

	public void exibirSaldoDisponivel() {
		double saldo = this.getSaldo();
		
		System.out.println(saldo * 95/100);
	}
	
}