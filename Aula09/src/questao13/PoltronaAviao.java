package questao13;

public class PoltronaAviao {
	int classificacao;
	boolean ocupada;
	
	public PoltronaAviao(int classificacao) {
		this.classificacao = classificacao;
		this.ocupada = false;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public int getClassificacao() {
		return classificacao;
	}
	
	public void ocuparAssento() {
		this.ocupada = true;
	}
	
	public void desocuparAssento() {
		this.ocupada = false;
	}
}