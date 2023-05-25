
public class Filme {
	private String nome;
	private String genero;
	private double valor;
	private int duracao;
	
	public Filme(String nome, String genero, double valor, int duracao) {
		this.nome = nome;
		this.genero = genero;
		this.valor = valor;
		this.duracao = duracao;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome + " - " + this.genero + " (" + this.duracao +" minutos)");
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}