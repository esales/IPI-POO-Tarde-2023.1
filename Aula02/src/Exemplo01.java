import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		String mensagem = "";
		
		System.out.println("Digite a idade: ");
		idade = scanner.nextInt();
		
		if (idade > 18) {
			mensagem = "Mais de 18 anos.";
		} else if (idade < 18){
			mensagem = "Menos de 18 anos.";
		} else {
			mensagem = "18 anos";
		}
		
		System.out.println(mensagem);
	}
}