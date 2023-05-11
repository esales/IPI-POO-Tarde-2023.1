package exercicio04;

public class Atleta {
	String nome;
	String esporte;
	int qtdMedalhas;
	
	public Atleta(String nome, String esporte, int qtdMedalhas) {
		this.nome = nome;
		this.esporte = esporte;
		this.qtdMedalhas = qtdMedalhas;
	}
	
	public void incrementarMedalhas() {
		qtdMedalhas++;
	}
	
	public void decrementarMedalhas() {
		if (qtdMedalhas > 0)
			qtdMedalhas--;
	}
}