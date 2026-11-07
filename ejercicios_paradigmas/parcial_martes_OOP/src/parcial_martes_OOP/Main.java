package parcial_martes_OOP;

public class Main {
	public static void main(String[] args) {
		JugadorAtaque atacante = new JugadorAtaque(10);
		JugadorMediocampista medioc = new JugadorMediocampista(5);
		JugadorRegateador regat = new JugadorRegateador(7);
		JugadorRegateador regat2 = new JugadorRegateador(11);
		
		try {
			medioc.sacarDelMedio();
			medioc.pasarBalon("Raso", regat);
			//atacante.disparar("Colocado");
			regat.regatear(atacante);
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
