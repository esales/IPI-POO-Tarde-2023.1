import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome = "";
		String sobrenome = "";
		String nomeCompleto = "";
		
		System.out.println("Digite o nome:");
		nome = scanner.next();
		
		System.out.println("Digite o sobrenome:");
		sobrenome = scanner.next();
		
		nomeCompleto = nome + " " + sobrenome;
		
		System.out.println(nomeCompleto);
	}
}