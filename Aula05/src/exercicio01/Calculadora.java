package exercicio01;

public class Calculadora {
	double numero;
	
	public Calculadora(double numero) {
		this.numero = numero;
	}
	
	void somar(int valor) {
		numero += valor;
		System.out.println(numero);
	}
	
	void subtrair(int valor) {
		numero -= valor;
		System.out.println(numero);
	}
	
	void multiplicar(int valor) {
		numero *= valor;
		System.out.println(numero);
	}
	
	void dividir(int valor) {
		numero /= valor;
		System.out.println(numero);
	}

}
