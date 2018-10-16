package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Juan Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologicas");
	
		for(Persona p: lasPersonas)
			System.out.println(p.getNombre() + ". " + p.getDescripcion());
	}

}

abstract class Persona {
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int anio, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);	// enero empieza en cero
		altaContrato = calendario.getTime();
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public String getDescripcion() {
		return "Este empleado tiene un ID: " + id + " con un sueldo de " + sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public Date getAltaContrato() {
		return altaContrato;
	}
	
	public void subirSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;
	
}

class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	
	public String getDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
	
}