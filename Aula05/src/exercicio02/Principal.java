package exercicio02;

public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta(1000);
		
		conta.depositar(250);
		
		conta.exibirSaldo();
		
		conta.sacar(450);
		
		conta.exibirSaldo();
	}

}
