package questao03;

public class PoltronaAviao {
	private int classificacao;
	private boolean ocupada;
	
	public PoltronaAviao(int classificacao) {
		this.classificacao = classificacao;
		this.ocupada = false;
	}
	
	public int getClassificacao() {
		return this.classificacao;
	}
	
	public boolean isOcupada() {
		return this.ocupada;
	}
	
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	public void ocupar() {
		this.ocupada = true;
	}
	
	public void desocupar() {
		this.ocupada = false;
	}
	
	

}
