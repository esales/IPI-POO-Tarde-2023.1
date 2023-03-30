public class Exercicio03 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 1; i<=100; i++) {	
			System.out.println("total (inicial): "+total);
			
			total += i;
		}
		
		System.out.println("O somatório é " + total);

	}
}