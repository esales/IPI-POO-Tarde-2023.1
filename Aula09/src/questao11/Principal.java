package questao11;

public class Principal {

	public static void main(String[] args) {
		Alimento a1 = new Alimento("Tomate", "Vegetal", 0.5, 3, 0);
	
		a1.imprimirInformacoes();
		
		a1.calcularCalorias();
	}

}
