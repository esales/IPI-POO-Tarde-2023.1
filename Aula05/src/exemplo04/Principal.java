package exemplo04;
public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo(40);
		
		veiculo1.exibirVelocidade();
		
		veiculo1.acelerar(10000);
		
		veiculo1.exibirVelocidade();
		
		veiculo1.frear(250);
		
		veiculo1.exibirVelocidade();
	}
	
}