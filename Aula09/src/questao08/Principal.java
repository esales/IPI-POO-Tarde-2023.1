package questao08;

public class Principal {
	
	public static void main(String[] args) {
		String[] telefones = new String[2];
		telefones[0] = "132133213";
		telefones[1] = "646664664";
		Contato c1 = new Contato("Nome", "Endereço!", telefones);
		
		c1.imprimirDados();
	}

}
