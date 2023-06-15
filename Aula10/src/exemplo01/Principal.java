package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Branco","Chevrolet", "Onix", 2023);
		
		System.out.println(v1.getModelo());
		
		Automovel a1 = new Automovel("Branco","Chevrolet", "Onix", 2023);
		System.out.println( a1.getMarca() );
	}
}