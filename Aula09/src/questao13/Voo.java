package questao13;
import java.util.ArrayList;

public class Voo {
	private ArrayList<PoltronaAviao> poltronas;
	
	public Voo() {
		this.poltronas = new ArrayList<PoltronaAviao>();	
	}

	public void inserirAssento(PoltronaAviao poltrona) {
		this.poltronas.add(poltrona);
	}
	
	public void removerAssento(int indice) {
		this.poltronas.remove(indice);
	}
	
	public void exibirLista() {
		String textoOcupacao = "";
		PoltronaAviao poltrona = null;
		
		System.out.println("----------");
		System.out.println("Lista de assentos");
		System.out.println();
		for(int i=0; i<= this.poltronas.size()-1; i++) {
			poltrona = this.poltronas.get(i);
			
			if (poltrona.ocupada){
				textoOcupacao = "ocupada";
			} else {
				textoOcupacao = "desocupada";
			}
			
			System.out.println("Poltrona " + i + " - " + textoOcupacao);
		}
		
		System.out.println("----------");
		System.out.println();
	}
	
	public void ocuparAssento(int indice) {
		PoltronaAviao poltrona = this.poltronas.get(indice);
		
		if (poltrona.ocupada) {
			System.out.println("Poltrona já ocupada");
		} else {		
			this.poltronas.get(indice).ocuparAssento();
		}
	}
	
	public void desocuparAssento(int indice) {
		PoltronaAviao poltrona = this.poltronas.get(indice);
		
		if (poltrona.ocupada) {
			this.poltronas.get(indice).desocuparAssento();
		} else {
			System.out.println("Poltrona não está ocupada");
		}
	}
		
	
	
}