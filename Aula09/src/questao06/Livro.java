package questao06;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private String isbn;
	private boolean capaDura;
	public Livro(String titulo, String autor, int numeroPaginas, String isbn, boolean capaDura) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.isbn = isbn;
		this.capaDura = capaDura;
	}
	
	public void imprimirDados() {
		System.out.println("Categoria: " + this.titulo);
		System.out.println("Endereço: " + this.autor);
		System.out.println("Área: " + this.numeroPaginas);
		System.out.println("Valor: " + this.isbn);
		System.out.println("Capa dura?: " + this.capaDura);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isCapaDura() {
		return capaDura;
	}
	public void setCapaDura(boolean capaDura) {
		this.capaDura = capaDura;
	}
}