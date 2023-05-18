package questao01;

public class Principal {

	public static void main(String[] args) {
		Animal a1 = new Animal("Marmaduke", 3,"Cachorro", "SRD");
		Animal a2 = new Animal("Jubileu", 5, "Gato", "Siamês");
		Animal a3 = new Animal("Chokito", 2, "Cavalo", "Quarto de milha");
		
		System.out.println( a1.getEspecie() );
		
	}
}