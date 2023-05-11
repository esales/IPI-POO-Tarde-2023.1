package getset;


public class Exemplo01 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João");
		
		System.out.println( p1.getNome() );
		
		p1.setNome("José");
		
		System.out.println( p1.getNome() );
	}
}