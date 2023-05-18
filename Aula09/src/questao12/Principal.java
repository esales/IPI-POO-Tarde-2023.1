package questao12;

public class Principal {

	public static void main(String[] args) {
		Selecao selecao = new Selecao("Brasil", 5);
		
		Jogador j1 = new Jogador("Neymar", 30, "PSG", 9999999, "Atacante", 500);
		Jogador j2 = new Jogador("Vinícius Jr", 21, "Real Madrid", 999999, "Atacante", 80);
		
		selecao.inserirJogador(j1);
		
		selecao.imprimirInformacoes();
		
		selecao.inserirJogador(j2);
		
		selecao.imprimirInformacoes();
		
		
		
	}

}
