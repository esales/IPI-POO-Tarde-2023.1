package exercicio02;

public class GerenciadorTempo {
	int horas;
	
	public GerenciadorTempo(int horas) {
		this.horas = horas;
	}

	public void converterParaMinutos() {
		System.out.println(horas + " horas equivalem a " + horas * 60 + " minutos");
		
	}
	
	public void converterParaSegundos() {
		System.out.println(horas + " horas equivalem a " + horas * 3600 + " segundos");
		
	}
}
