package questao11;

public class Alimento {
	private String nome;
	private String origem;
	private double qtdProteina;
	private double qtdCarboidrato;
	private double qtdGordura;
	
	public Alimento(String nome, String origem, double qtdProteina, double qtdCarboidrato, double qtdGordura) {
		this.nome = nome;
		this.origem = origem;
		this.qtdProteina = qtdProteina;
		this.qtdCarboidrato = qtdCarboidrato;
		this.qtdGordura = qtdGordura;
	}
	
	public void imprimirInformacoes() {
		System.out.println("Quantidade de proteínas: " + this.qtdProteina);
		System.out.println("Quantidade de carboidratos: " + this.qtdCarboidrato);
		System.out.println("Quantidade de gorduras: " + this.qtdGordura);
	}
	
	public void calcularCalorias() {
		double calorias = 0;
		
		calorias = this.qtdProteina*4 + this.qtdCarboidrato*4 + this.qtdGordura*9;
		
		System.out.println("Calorias: " + calorias);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public double getQtdProteina() {
		return qtdProteina;
	}

	public void setQtdProteina(double qtdProteina) {
		this.qtdProteina = qtdProteina;
	}

	public double getQtdCarboidrato() {
		return qtdCarboidrato;
	}

	public void setQtdCarboidrato(double qtdCarboidrato) {
		this.qtdCarboidrato = qtdCarboidrato;
	}

	public double getQtdGordura() {
		return qtdGordura;
	}

	public void setQtdGordura(double qtdGordura) {
		this.qtdGordura = qtdGordura;
	}
}