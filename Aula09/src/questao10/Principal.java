package questao10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome = "";
		String genero = "";
		int duracao = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Filme filme = null;
		
		System.out.println("Digite o nome do filme: ");
		nome = scanner.next();
		
		while(!nome.equals("fim")) {
			System.out.println("Digite o gênero: ");
			genero = scanner.next();
			
			System.out.println("Digite a duração: ");
			duracao = scanner.nextInt();
			
			filme = new Filme(nome, genero, duracao);
			
			filmes.add(filme);
			
			System.out.println("Digite o nome do filme: ");
			nome = scanner.next();
		}
		
		for(int i=0; i <= filmes.size()-1; i++) {
			System.out.println( filmes.get(i).getNome() );
		}
	}
}