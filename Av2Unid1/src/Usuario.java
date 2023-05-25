
public class Usuario {
	private String nome;
	private int idade;
	private boolean premium;
	
	public Usuario(String nome, int idade, boolean premium) {
		this.nome = nome;
		this.idade = idade;
		this.premium = premium;
	}
	
	public String getNome() {
		return this.nome;
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

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
}