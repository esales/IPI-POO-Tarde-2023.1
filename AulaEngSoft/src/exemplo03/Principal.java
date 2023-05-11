package exemplo03;

public class Principal {

	public static void main(String[] args) {
		Fone[] telefones = new Fone[2];
		telefones[0] = new Fone("81", "999999999", true, null);
		telefones[1] = new Fone("81", "988888888", true, null);

		Pessoa p1 = new Pessoa("Eric", "Sales", telefones);
		
		System.out.println(p1.nome);
		System.out.println(p1.sobrenome);
		System.out.println( p1.fones[1].numero );
		System.out.println( p1.fones[0].numero );
		
		telefones[0].dono = p1;
		telefones[1].dono = p1;
		
		System.out.println( telefones[0].dono.nome );

	}
}