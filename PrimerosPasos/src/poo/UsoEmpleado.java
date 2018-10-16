package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Empleado empleado1 = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
//		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
//		Empleado empleado3 = new Empleado("Maria Martin", 105000, 2002, 03, 15);
//		
//		empleado1.subirSueldo(5);
//		empleado2.subirSueldo(5);
//		empleado3.subirSueldo(5);
//		
//		System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() +
//				" Fecha de Alta: " + empleado1.getAltaContrato());
//		System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() +
//				" Fecha de Alta: " + empleado2.getAltaContrato());
//		System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() +
//				" Fecha de Alta: " + empleado3.getAltaContrato());
		
		Jefatura jefeRRHH = new Jefatura("Juan", 100000, 2006, 9, 25);
		jefeRRHH.setIncentivo(2570);
		
		Empleado [] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefeRRHH;		// polimorfismo en accion, principio de sustitucion
		misEmpleados[5] = new Jefatura("Maria Lopez", 95000, 1999, 05, 26);
		
		Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
		jefaFinanzas.setIncentivo(10000);
		
		Empleado directorComercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
		Comparable ejemplo1 = new Empleado("Elizabeth", 95000, 2011, 06, 07);
		
		System.out.println(jefaFinanzas.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefaFinanzas.getNombre() + " tiene un bonus de " +
				jefaFinanzas.estableceBonus(500));

		System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de " +
				misEmpleados[3].estableceBonus(200));
		
		if(directorComercial instanceof Empleado)
			System.out.println("Es de tipo Jefatura.");

		if(ejemplo1 instanceof Comparable)
			System.out.println("Implementa la interfaz comparable.");
		
//		for(int i = 0; i < 3; i++) {
//			misEmpleados[i].subirSueldo(5);
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: " + misEmpleados[i].getSueldo() +
//			" Fecha de Alta: " + misEmpleados[i].getAltaContrato());
//		}

		for(Empleado e: misEmpleados) 
			e.subirSueldo(5);
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) 
			System.out.println("Nombre: " + e.getNombre() + " Sueldo: " + e.getSueldo() +
				" Fecha de Alta: " + e.getAltaContrato());
		
		/*	Enlazado dinamico: la maquina virtual de Java es capaz, en tiempo de ejecucion,
		 * 	de saber a que metodo perteneciente a la super clase o subclase tiene que llamar
		 */
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);	// enero empieza en cero
		altaContrato = calendario.getTime();
	}
	
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	public double estableceBonus(double gratificacion) {
		return Trabajadores.bonusBase + gratificacion;
	}
	
	public String getNombre() {
		return nombre;
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
	
	public int compareTo(Object object) {
		Empleado otroEmpleado = (Empleado) object;
		if(this.sueldo < otroEmpleado.sueldo)
			return -1;
		if(this.sueldo > otroEmpleado.sueldo)
			return 1;
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}

final class Jefatura extends Empleado implements Jefes{	// Ninguna otra clase podra heredar de Jefatura
	
	public Jefatura(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
	}
	
	public String tomarDecisiones(String decision) {
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
	}
	
	public double estableceBonus(double gratificacion) {
		double prima = 2000;
		return Trabajadores.bonusBase + gratificacion + prima;
	}
	
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
}

//class Director extends Jefatura {
//	
//	public Director(String nom, double sue, int anio, int mes, int dia) {
//		super(nom, sue, anio, mes, dia);
//	}
//	
//}