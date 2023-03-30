import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		double media = 0;
		int somatorio = 0;
		int contador = 0;
		
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		
		while(numero>=0) {
			somatorio += numero;
			contador++;
			
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
		}
		
		if (contador > 0) {
		
			media = somatorio/contador;
			
			System.out.println("Média: " + media);
			System.out.println("Somatório: " + somatorio);
			System.out.println("Quantidade: " + contador);
		} else {
			System.out.println("Nenhum número válido foi digitado.");
		}
	}
}