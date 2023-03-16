import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numeroA = 0;
		int numeroB = 0;
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numeroA = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numeroB = scanner.nextInt();
		
		soma = numeroA + numeroB;
		
		System.out.println("Soma: " + soma);

	}
}