package composicao;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.dependentes.add(new Dependente());
		f.dependentes.add(new Dependente());
		f.dependentes.add(new Dependente());
	}

}
