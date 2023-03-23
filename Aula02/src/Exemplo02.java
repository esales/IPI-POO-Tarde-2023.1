import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota = 0;
		double somatorio = 0;
		int quantidade = 0;
		double media = 0;
		
		System.out.println("Digite a nota: ");
		nota = scanner.nextDouble();
		
		while (nota >= 0) {
			somatorio += nota;
			quantidade++;
			
			System.out.println("Digite a nota: ");
			nota = scanner.nextDouble();
		}
		
		if (quantidade > 0) {
			media = somatorio/quantidade;
			System.out.println(media);
		} else {
			System.out.println("Nenhuma nota digitada.");
		}
		
		
		
		

	}
}