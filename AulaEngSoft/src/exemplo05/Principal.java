package exemplo05;

public class Principal {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		
		f.dependentes.add( new Dependente("Jo�o") );
		f.dependentes.add( new Dependente("Jos�") );
		
		System.out.println( f.dependentes.get(1).nome );
		
	}

}
