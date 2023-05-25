
public class Principal {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("Teste", 30, true);
		Playlist p1 = new Playlist(usuario);
		
		Filme f1 = new Filme("Filme 1", "Ação", 5.30, 120);
		Filme f2 = new Filme("Filme 2", "Comédia", 9.90, 105);
		Filme f3 = new Filme("Filme 3", "Drama", 3.15, 88);
		
		p1.adicionarFilme(f1);
		p1.adicionarFilme(f2);
		p1.adicionarFilme(f3);
		
		p1.listarFilmes();
	}
}