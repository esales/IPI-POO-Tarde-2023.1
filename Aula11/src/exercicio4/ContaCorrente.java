package exercicio4;

public class ContaCorrente extends ContaBancaria {
	private double limiteChequeEspecial;

	public ContaCorrente(String numero, double saldo, double limiteChequeEspecial) {
		super(numero, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public void sacar(double valor) {
		double valorChequeEspecial = this.limiteChequeEspecial * -1;
		double saldoAtual = this.getSaldo();
		
		if (saldoAtual - valor >= valorChequeEspecial) {
			this.setSaldo(saldoAtual - valor);
			
			System.out.println("Saque realizado: " + valor);
		} else {
			System.out.println("Saldo insuficiente: " +  valor);
		}
	}
	
}