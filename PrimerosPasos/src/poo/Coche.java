package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int pesoPlataforma;
	
	private String color;
	private int pesoTotal;
	private boolean asientoCuero, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 200;
		ancho = 300;
		pesoPlataforma = 500;
	}
	
	public String getDatosGrales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" +
				". Mide " + largo/100 + " metros con un ancho de " + ancho +
				" cm y un peso de plataforma de " + pesoPlataforma + " kg.";
	}
	
	public void setColor(String colorCoche) {
		color = colorCoche;
	}
	
	public String getColor() {
		return "El color del coche es " + color;
	}
	
	public void setAsientos(String asientoCuero) {
		if(asientoCuero.equalsIgnoreCase("si"))
			this.asientoCuero = true;
		else
			this.asientoCuero = false;
	}
	
	public String getAsientos() {
		if(asientoCuero == true)
			return "El coche tiene asientos de cuero.";
		else
			return "El coche tiene asientos de serie.";
	}
	
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si"))
			this.climatizador = true;
		else
			this.climatizador = false;
	}
	
	public String getClimatizador() {
		if(climatizador == true)
			return "El coche incorpora climatizador.";
		else
			return "El coche lleva aire acondicionado.";
	}
	
	public String dimePesoCoche() {
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientoCuero == true)
			pesoTotal = pesoTotal + 50;
		if(climatizador == true)
			pesoTotal = pesoTotal + 20;
		return "El peso del coche es " + pesoTotal;
	}
	
	public int getPrecioCoche() {
		int precioFinal = 10000;
		if(asientoCuero == true)
			precioFinal+= 2000;
		if(climatizador == true)
			precioFinal+= 1500;
		return precioFinal;
	}
	
}
