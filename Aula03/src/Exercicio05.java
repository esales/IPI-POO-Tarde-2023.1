import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomePessoaMaisNova = "";
		int idadePessoaMaisNova = 150;
		String nomePessoaMaiorSalario = "";
		double maiorSalario = 0;
		String nome = "";
		int idade = 0;
		double salario = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite o nome: ");
			nome = scanner.next();
			
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			
			System.out.println("Digite o salário: ");
			salario = scanner.nextDouble();
			
			System.out.println("------------------");
			
			if (idade < idadePessoaMaisNova) {
				idadePessoaMaisNova = idade;
				nomePessoaMaisNova = nome;
			}
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
				nomePessoaMaiorSalario = nome;
			}
		}
		
		System.out.println();
		System.out.println("Pessoa mais nova: " + nomePessoaMaisNova);
		System.out.println("Idade da pessoa mais nova: " + idadePessoaMaisNova);
		System.out.println("Pessoa com maior salário: " + nomePessoaMaiorSalario);
		System.out.println("Maior salário: " + maiorSalario);
	}
}