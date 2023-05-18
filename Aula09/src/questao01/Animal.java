package questao01;

public class Animal {
	private String nome;
	private int idade;
	private String especie;
	private String raca;
	
	public Animal(String nome, 
					int idade, 
					String especie, 
					String raca) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.raca = raca;		
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecie() {
		return this.especie; 
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getRaca() {
		return this.raca; 
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public int getIdade() {
		return this.idade; 
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}