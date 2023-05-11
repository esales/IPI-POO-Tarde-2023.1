package exemplo02;

public class Principal {

	public static void main(String[] args) {
		Fone[] telefones = new Fone[2];
		telefones[0] = new Fone("81", "999999999", true);
		telefones[1] = new Fone("81", "988888888", true);

		Pessoa p1 = new Pessoa("Eric", "Sales", telefones);
		
		System.out.println(p1.nome);
		System.out.println(p1.sobrenome);
		System.out.println( p1.fones[1].numero );
		System.out.println( p1.fones[0].numero );
		
		

	}
}