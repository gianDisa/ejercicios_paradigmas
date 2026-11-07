package ejercicio_3;

public class Circulo {

	private double radio;
	private double diametro;
	private double perimetro;
	private double area;
	
	//constructor con radio
	public Circulo(double radioVal) {
		radio = radioVal;
		diametro = 2 * radio;
		perimetro = 2 * radio * Math.PI;
		area = Math.PI * radio * radio;
	}
	
	public void cambiarRadio(double radioVal) {
		radio = radioVal;
		diametro = 2 * radio;
		perimetro = 2 * radio * Math.PI;
		area = Math.PI * radio * radio;
	}
	
	public void cambiarDiametro(double diamVal) {
		diametro = diamVal;
		radio = diametro / 2;
		perimetro = 2 * radio * Math.PI;
		area = Math.PI * radio * radio;
	}
	
	public void cambiarPerimetro(double perimVal) {
		perimetro = perimVal;
		radio = perimetro / (2 * Math.PI);
		diametro = radio * 2;
		area = Math.PI * radio * radio;
	}
	
	public void cambiarArea(double areaVal) {
		area = areaVal;
		radio = area / (Math.PI * radio * radio); 
		diametro = radio * 2;
		perimetro = 2 * radio * Math.PI;
	}
	
	public double obtenerRadio() {
		return radio;
	}
	
	public double obtenerDiametro() {
		return diametro;
	}
	
	public double obtenerPerimetro() {
		return perimetro;
	}
	
	public double obtenerArea() {
		return area;
	}
}
