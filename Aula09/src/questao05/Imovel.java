package questao05;

public class Imovel {
	private String categoria;
	private String endereco;
	private int area;
	private double valor;
	private boolean financiavel;
	public Imovel(String categoria, String endereco, int area, double valor, boolean financiavel) {
		super();
		this.categoria = categoria;
		this.endereco = endereco;
		this.area = area;
		this.valor = valor;
		this.financiavel = financiavel;
	}
	
	public void imprimirDados() {
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Área: " + this.area);
		System.out.println("Valor: " + this.valor);
		System.out.println("Financiável: " + this.financiavel);
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isFinanciavel() {
		return financiavel;
	}
	public void setFinanciavel(boolean financiavel) {
		this.financiavel = financiavel;
	}
}