import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numeroRecebido = scanner.nextInt();
		
		System.out.print("O n�mero digitado foi: " + numeroRecebido);
		
	}
}