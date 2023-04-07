package Figuras;

public class Rectangulo {

	private Double ancho;
	private Double alto;
	
	
	public Rectangulo (Double ancho, Double alto) {
		this.ancho = ancho;
		this.alto = alto;
		
	}
	
	public Double getPerimetro() {
	Double perimetro;
	
	perimetro = this.ancho*2+this.alto*2;
		
		return perimetro;
	}

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
