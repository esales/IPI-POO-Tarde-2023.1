package exemplo04;

public class Principal {

	public static void main(String[] args) {
		
		Time t = new Time();
		
		Jogador j1 = new Jogador("João");
		Jogador j2 = new Jogador("José");
		
		t.jogadores.add(j1);
		t.jogadores.add(j2);
		
		System.out.println(t.jogadores.get(0).nome);
		System.out.println(t.jogadores.get(0).idade);
		
		j1.idade = 20;
		
		System.out.println(t.jogadores.get(0).nome);
		System.out.println(t.jogadores.get(0).idade);
		

	}

}
