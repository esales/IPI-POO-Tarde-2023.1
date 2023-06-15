package exemplo03;

public class Principal2 {

	public static void main(String[] args) {
		
		Automovel v1 = new Automovel();
		VeiculoTerrestre v2 = new Automovel();
		
		
		Foguete v3 = new Foguete();
		VeiculoAereo v4 = new Foguete();
		Veiculo v5 = new Foguete();
		
		
		System.out.println(v5 instanceof Foguete);
		System.out.println(v5 instanceof VeiculoAereo);
		System.out.println(v5 instanceof Veiculo);
		System.out.println(v5 instanceof VeiculoTerrestre);
		System.out.println(v5 instanceof Automovel);
		

	}
}