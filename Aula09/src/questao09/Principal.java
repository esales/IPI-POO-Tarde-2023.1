package questao09;

public class Principal {
	
	public static void main(String[] args) {
		OrcamentoPessoal orcamento = new OrcamentoPessoal(1000);
		
		orcamento.imprimirSaldo();
		
		orcamento.inserirValor(200);
		
		orcamento.retirarValor(50);
		
		orcamento.imprimirSaldo();
	}
}	