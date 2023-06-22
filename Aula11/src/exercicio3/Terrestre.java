package exercicio3;

public class Terrestre extends Animal {
	private boolean nadador;

	public Terrestre(String nome, int numeroPatas, boolean nadador) {
		super(nome, numeroPatas);
		this.nadador = nadador;
	}

	public boolean isNadador() {
		return nadador;
	}

	public void setNadador(boolean nadador) {
		this.nadador = nadador;
	}
}