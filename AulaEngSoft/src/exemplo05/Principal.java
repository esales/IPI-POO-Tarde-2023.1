package exemplo05;

public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		f.dependentes.add( new Dependente("João") );
		f.dependentes.add( new Dependente("José") );
		
		System.out.println( f.dependentes.get(1).nome );
		
	}

}
