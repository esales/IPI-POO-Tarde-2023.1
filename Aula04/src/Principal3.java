public class Principal3 {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.velocidade = 50;
		
		System.out.println( veiculo1.velocidade );
		
		veiculo1.acelerar(10);
		
		System.out.println( veiculo1.velocidade );
	}
}