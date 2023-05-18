package questao12;

import java.util.ArrayList;

public class Selecao {
	private String nome;
	private int numeroTitulos;
	private ArrayList<Jogador> jogadores;
	
	public Selecao(String nome, int numeroTitulos) {
		this.nome = nome;
		this.numeroTitulos = numeroTitulos;
		
		this.jogadores = new ArrayList<Jogador>();
	}
	
	public void inserirJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
	
	public void removerJogador(int indice) {
		this.jogadores.remove(indice);
	}
	
	public void imprimirInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Títulos: " + this.numeroTitulos);
		System.out.println("Jogadores: ");
		
		for(int i=0; i<=this.jogadores.size()-1; i++) {
			System.out.println( this.jogadores.get(i).getNome()  );
		}
		
		System.out.println("---------------------");
	}
}