import java.util.ArrayList;

public class Playlist {
	private Usuario usuario;
	private ArrayList<Filme> filmes;
	
	public Playlist(Usuario usuario) {
		this.usuario = usuario;
		this.filmes = new ArrayList<Filme>();
	}
	
	public void adicionarFilme(Filme filme) {
		this.filmes.add(filme);
	}
	
	public void listarFilmes() {
		for(Filme f:filmes) {
			f.imprimirDados();
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}
}