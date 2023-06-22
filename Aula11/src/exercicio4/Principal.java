package exercicio4;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("123", 200, 300);
		ContaPoupanca c2 = new ContaPoupanca("456", 2000, 1);
		ContaSalario c3 = new ContaSalario("789", 1000);
		
		c1.sacar(200);
		c1.sacar(301);
		c1.sacar(300);
		
		System.out.println(c1.getSaldo());
		c1.sacar(1);
		c1.depositar(10);
		c1.sacar(1);
		
		c2.calcularRendimento();

		c3.exibirSaldoDisponivel();
	}

}
