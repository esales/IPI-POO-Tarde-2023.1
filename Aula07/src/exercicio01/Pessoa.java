package exercicio01;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	private boolean dirige;
	
	public Pessoa(String nome,
				  int idade,
				  double salario,
				  boolean dirige) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.dirige = dirige;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public boolean getDirige() {
		return this.dirige;
	}
	
	public void setDirige(boolean dirige) {
		this.dirige = dirige;
	}

}
