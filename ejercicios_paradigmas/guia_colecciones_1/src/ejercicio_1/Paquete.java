package ejercicio_1;

public class Paquete {
	private int numSeg;
	private String dirOrig;
	private String dirDestino;
	private double peso;
	
	public Paquete(int numSeg, String dirOrig, String dirDestino, double peso) {
		this.dirDestino=dirDestino;
		this.dirOrig=dirOrig;
		this.numSeg=numSeg;
		this.peso=peso;
	}
	
	public int getNumSeg(){
		return numSeg;
	}
	
	public String getDirOrig() {
		return dirOrig;
	}
	
	public String getDirDest() {
		return dirDestino;
	}
	
	public double getPeso(){
		return peso;
	}
	
	@Override
	public String toString() {
	    // Acá armas el texto exactamente como quieres que se lea en la consola
	    return "Paquete N°: " + numSeg + " | Origen: " + dirOrig + " | Destino: " + dirDestino + " | Peso: " + peso;
	}
}
