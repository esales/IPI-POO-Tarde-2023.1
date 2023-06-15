package exemplo03;

public class Principal {

	public static void main(String[] args) {
		Automovel a1 = new Automovel();
		a1.setVelocidadeMaxima(10);
		
		Foguete f1 = new Foguete();
		f1.setVelocidadeMaxima(1000);
		f1.setQtdAsas(0);
		
		Veiculo v1 = new Veiculo();
		VeiculoTerrestre v2 = new VeiculoTerrestre();
		
		System.out.println(a1 instanceof Automovel);
		System.out.println(a1 instanceof VeiculoTerrestre);
		System.out.println(a1 instanceof Veiculo);
		

	}
}