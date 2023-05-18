package questao13;

public class Principal {

	public static void main(String[] args) {
		Voo voo = new Voo();
		
		PoltronaAviao p1 = new PoltronaAviao(1);
		PoltronaAviao p2 = new PoltronaAviao(2);
		PoltronaAviao p3 = new PoltronaAviao(3);
		PoltronaAviao p4 = new PoltronaAviao(4);
		PoltronaAviao p5 = new PoltronaAviao(5);
		
		voo.inserirAssento(p1);
		voo.inserirAssento(p2);
		voo.inserirAssento(p3);
		voo.inserirAssento(p4);
		voo.inserirAssento(p5);
		
		voo.exibirLista();
		
		voo.ocuparAssento(3);
		voo.ocuparAssento(4);
		
		voo.exibirLista();
		
		voo.ocuparAssento(4);
		voo.desocuparAssento(3);
		voo.desocuparAssento(2);
		
		voo.exibirLista();
		
	}

}
