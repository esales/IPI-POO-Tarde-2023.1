package exemplo01;
public class Veiculo {
	
	String cor;
	int velocidade;
	int numeroRodas;
	int numeroPortas;
	String modelo;
	String marca;
	
	void acelerar(int incremento) {
		
		if ((velocidade + incremento) <= 180) {
			velocidade += incremento;
		} else {
			velocidade = 180;
		}
	}
	
	void frear(int decremento) {
		if ((velocidade-decremento) >= 0) {
			velocidade -= decremento;
		} else {
			velocidade = 0;
		}
	}
	
	void exibirVelocidade() {
		System.out.println("Velocidade: " + velocidade);
	}
	
}






