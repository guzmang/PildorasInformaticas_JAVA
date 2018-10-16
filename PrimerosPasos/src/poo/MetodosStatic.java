package poo;

public class MetodosStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.getDatos());
		System.out.println(trabajador2.getDatos());
		System.out.println(trabajador3.getDatos());
		System.out.println(trabajador4.getDatos());
	}

}

class Empleados {
	
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getDatos() {
		return "El nombre es " + nombre + ", la seccion es " + seccion + " y el id: " + id;
	}

	public static String getIdSiguiente() {
		return "El idSiguiente es " + idSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
}
