package exercicio04;

public class Principal {

	public static void main(String[] args) {
		Atleta atleta = new Atleta("Fulano", "Tenis", 0);
		
		atleta.incrementarMedalhas();
		atleta.incrementarMedalhas();
		
		System.out.println(atleta.qtdMedalhas);
		
		atleta.decrementarMedalhas();
		atleta.decrementarMedalhas();
		atleta.decrementarMedalhas();
		
		System.out.println(atleta.qtdMedalhas);
	}

}
