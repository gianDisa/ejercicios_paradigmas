package parcial_nov_2025;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		List<Criatura> criaturas = new ArrayList<>();
		
		Xenomorfo xeno = new Xenomorfo("Alien", 1, 1);
		Facehugger hug = new Facehugger("Face", 2, 1);
		Reina reini = new Reina("Quuen",3,1);
		
		criaturas.add(reini);
		criaturas.add(xeno);
		criaturas.add(hug);
		
		Collections.sort(criaturas);
		
		for(Criatura bicho : criaturas) {
			
			System.out.println(bicho.nombre+ " " + bicho.getNivPelig());
			bicho.atacar();
		}
		
	}

	
}
