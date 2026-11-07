package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Paquete> paquetes = new ArrayList<>();
		Paquete paquete0 = new Paquete(0, "Enrique", "Cacique", 1.30);
		Paquete paquete1 = new Paquete(1, "Posadas", "Bolivar", 1.30);
		Paquete paquete2 = new Paquete(2, "Posadas", "Bolivares", 1.20);
		Paquete paquete3 = new Paquete(3, "Rosario", "Rivadavia", 1.30);
		paquetes.add(paquete1);
		paquetes.add(paquete2);
		paquetes.add(paquete3);
		//paquetes.add(new Paquete(3, "Rosario", "Rivadavia", 1.30));
		
		int numeroIng = 2;
		double pesoIng = 1.10;
		
		//System.out.println(paquetes.contains(paquete3));
		for (Paquete paquete : paquetes) {
			if((paquete.getNumSeg()) == numeroIng) {
				System.out.println(paquete.getNumSeg()+" "+paquete.getPeso()
						+" "+paquete.getDirOrig()+" "+paquete.getDirDest());
			}
		}
		
		for (Paquete paquete : paquetes) {
			if((paquete.getPeso()) > pesoIng) {
				System.out.println(paquete.getNumSeg()+" "+paquete.getPeso()
						+" "+paquete.getDirOrig()+" "+paquete.getDirDest());
			}
		}
		
		//SI EL NUMERO DE SEGUIMIENTO FUERA = A LA POSIC 
		System.out.println(paquetes.get(0).toString());  
	}

}
