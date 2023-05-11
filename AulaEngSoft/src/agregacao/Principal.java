package agregacao;

public class Principal {

	public static void main(String[] args) {
		Time time = new Time();
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		
		time.jogadores.add(j1);
		time.jogadores.add(j2);
		time.jogadores.add(j3);
	}

}
