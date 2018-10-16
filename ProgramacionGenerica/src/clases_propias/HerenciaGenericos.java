package clases_propias;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Principio de sustitucion:
//		Empleado administrativa = new Empleado("Elena", 45, 1500);
//		Jefe directoraComercial = new Jefe("Ana", 27, 3500);
//		Empleado nuevoEmpleado = directoraComercial;
		
		// Con clases genericas no funciona este principio
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		Pareja<Jefe> directoraComercial = new Pareja<Jefe>();
//		Pareja<Empleado> nuevoEmpleado = directoraComercial;
		Pareja.imprimirTrabajadorError(administrativa);
//		Pareja.imprimirTrabajadorError(directoraComercial);
		Pareja.imprimirTrabajador(administrativa);
		Pareja.imprimirTrabajador(directoraComercial);
	}

}
