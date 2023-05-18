package questao10;

public class Filme {
	private String nome;
	private String genero;
	private int duracao;
	
	public Filme(String nome, String genero, int duracao) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.duracao = duracao;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome + " - " + this.genero + " (" + this.duracao +")");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}