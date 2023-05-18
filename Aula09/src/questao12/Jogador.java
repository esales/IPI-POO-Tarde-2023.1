package questao12;

public class Jogador {
	private String nome;
	private int idade;
	private String clube;
	private double salario;
	private String posicao;
	private int numeroGols;
	
	public Jogador(String nome, int idade, String clube, double salario, String posicao, int numeroGols) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.clube = clube;
		this.salario = salario;
		this.posicao = posicao;
		this.numeroGols = numeroGols;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Clube: " + this.clube);
		System.out.println("Salário: " + this.salario);
		System.out.println("Posição: " + this.posicao);
		System.out.println("Número de gols: " + this.numeroGols);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getClube() {
		return clube;
	}

	public void setClube(String clube) {
		this.clube = clube;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public int getNumeroGols() {
		return numeroGols;
	}

	public void setNumeroGols(int numeroGols) {
		this.numeroGols = numeroGols;
	}
}