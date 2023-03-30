import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite o número: ");
		numero = scanner.nextInt();
		
		for(int i=1; i<=20; i++) {
			int resultado = numero * i;
			
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		
	}
}