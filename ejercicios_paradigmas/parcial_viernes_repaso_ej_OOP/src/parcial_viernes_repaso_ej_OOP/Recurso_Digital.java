package parcial_viernes_repaso_ej_OOP;

import java.util.List;
import java.util.ArrayList;

public class Recurso_Digital extends Publicacion{
	
	private String url;
	private List<String> socios = new ArrayList<>();
	
	public Recurso_Digital(String titulo, String url) {
		super(titulo);
		this.url=url;
	}
	
	public void prestar(String socio) {
		if(estaDisponible()) {
			if(!socios.contains(socio)) {
				socios.add(socio);
				System.out.println("Prestado.");
			}else {
				throw new IllegalStateException("El socio ya tiene asignado un recurso!");
			}
		}else {
			throw new IllegalStateException("El recurso no esta dispo!");
		}
	}
	
	public void devolver(String socio) {
		if(socios.contains(socio)) {
			socios.remove(socio);
			System.out.println("Devuelto.");
		}else {
			throw new IllegalStateException("El socio no tiene asignado un recurso.");
		}
	}
	
	public boolean estaDisponible() {
		if(socios.size() < 3) {
			return true;
		}
		return false;
	}
}
