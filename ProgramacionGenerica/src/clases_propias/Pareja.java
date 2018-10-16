package clases_propias;

// indicamos que va a manejar un argumento que es generico
public class Pareja<T> {

	public Pareja() {
		primero = null;
	}
	
	public static void imprimirTrabajadorError(Pareja<Empleado> p) {
		Empleado primero = p.getPrimero();
		System.out.println(primero);
	}
	
	// Tipo comodin: para que acepte cualquier tipo de Empleado
	// Con "?" indico que puede recibir Empleado o cualquier subclase que herede de el
	public static void imprimirTrabajador(Pareja<? extends Empleado> p) {
		Empleado primero = p.getPrimero();
		System.out.println(primero);
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	private T primero;
	
}
