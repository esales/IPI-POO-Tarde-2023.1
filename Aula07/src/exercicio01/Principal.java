package exercicio01;

public class Principal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Victoria", 50, 25000, false);
		
//		System.out.println( p1.getIdade() );
//		
//		p1.setIdade(20);
//		
//		System.out.println( p1.getIdade() );
		
		Pessoa p2 = new Pessoa("Pollyana", 40, 30000, true);
		Pessoa p3 = new Pessoa("Rafael", 20, 70000, false);
		
		
		Agenda agenda = new Agenda();

		agenda.adicionarPessoa(p1);
		agenda.adicionarPessoa(p2);
		agenda.adicionarPessoa(p3);
		
		agenda.imprimirListaPessoas();
		
	}
}