package questao03;

public class Principal {

	public static void main(String[] args) {
		PoltronaAviao p1 = new PoltronaAviao(1);
		PoltronaAviao p2 = new PoltronaAviao(2);
		
		System.out.println( p1.isOcupada());
		
		p1.ocupar();
		
		System.out.println( p1.isOcupada());
	}

}
