public class Principal2 {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo();
		Veiculo veiculo2 = new Veiculo();
		
		veiculo1.numeroPortas = 4;
		veiculo1.numeroRodas = 4;
		veiculo1.cor = "azul";
		veiculo1.marca = "Fiat";
		veiculo1.modelo = "Uno";
		veiculo1.velocidade = 75;
		
		veiculo2.numeroPortas = 1;
		veiculo2.numeroRodas = 6;
		veiculo2.cor = "amarelo";
		veiculo2.marca = "Volkswagen";
		veiculo2.modelo = "V8l";
		veiculo2.velocidade = 50;
		
		System.out.println(veiculo1.marca);
		System.out.println(veiculo2.marca);

	}
}