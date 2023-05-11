package exemplo01;

public class Principal {

	public static void main(String[] args) {
		Fone f1 = new Fone("81", "999999999", true);

		Pessoa p1 = new Pessoa("Eric", "Sales", f1);
		
		System.out.println(p1.nome);
		System.out.println(p1.sobrenome);
		System.out.println( p1.fone.numero );

	}
}