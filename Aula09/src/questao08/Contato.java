package questao08;

public class Contato {
	private String nome;
	private String endereco;
	private String[] telefones;
	
	public Contato(String nome, String endereco, String[] telefones) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Telefones:");
		
		for(int i=0; i<=this.telefones.length-1; i++) {
			System.out.println(this.telefones[i]);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String[] getTelefones() {
		return telefones;
	}

	public void setTelefones(String[] telefones) {
		this.telefones = telefones;
	}
}