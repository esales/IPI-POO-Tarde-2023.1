import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double valorDiaria = 60;
		double valorTaxa = 0;
		Scanner scanner = new Scanner(System.in);
		int numeroDiarias = 0;
		double valorTotal = 0;
		
		System.out.println("Digite o número de diárias");
		numeroDiarias = scanner.nextInt();
		
		if (numeroDiarias > 15) {
			valorTaxa = 5.5;
		} else if (numeroDiarias < 15) {
			valorTaxa = 8;
		} else {
			valorTaxa = 6;
		}
		
		valorTotal = (valorDiaria + valorTaxa) * numeroDiarias;
		
		System.out.println("O valor total é " + valorTotal);
		
		
		
		
		
		
		
		
	}

}