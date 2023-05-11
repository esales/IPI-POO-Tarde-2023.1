package exercicio01;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> pessoas;
	
	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public ArrayList<Pessoa> getPessoas() {
		return this.pessoas;
	}
	
	public void adicionarPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void imprimirListaPessoas() {
		for(Pessoa pessoa: this.pessoas) {
			System.out.println( pessoa.getNome() + " - " + pessoa.getIdade());
		}
	}
}