package clases_propias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// La clase String implementa Comparable
		String[] nombres = {"Maria", "Jose", "Pepe"};
		// le indico el tipo que le paso entre <>, no es necesario
		String elementos = MisMatrices.<String>getElementos(nombres);
		System.out.println(elementos);
		System.out.println(MisMatrices.getMenor(nombres));
		
		// La clase GregorianCalendar implementa Comparable
		GregorianCalendar[] fechas = {new GregorianCalendar(2015, 07, 12), 
				new GregorianCalendar(2015, 05, 12),
				new GregorianCalendar(2015, 04, 12)
		};
		System.out.println(MisMatrices.getElementos(fechas));
		System.out.println(MisMatrices.getMenor(fechas).getTime());
		
		// La clase Empleado que diseñamos NO implementa Comparable
		Empleado[] listaEmpleados = {new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500), 
				new Empleado("Ana", 45, 2500), 
				new Empleado("Ana", 45, 2500), 
				new Empleado("Ana", 45, 2500)
		};
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		// Empleado debe implementar Comparable para utilizar el metodo getMenor()
//		System.out.println(MisMatrices.getMenor(listaEmpleados));
		
	}

}

class MisMatrices {
	
	// <T>: argumento de tipo
	// Con <T> le indicamos que es un tipo generico
	// Y con T[] indicamos que recibe un array generico
	public static <T> String getElementos(T[] a) {
		return "El array tiene " + a.length + " elementos.";
	}
	
	// A pesar de que comparable es una interfaz, uso extends y no implements
	// Todos los args deben ser objetos que implementen dicha interfaz
	public static <T extends Comparable> T getMenor(T[] a) {
		if(a == null || a.length == 0)
			return null;
		T elemMenor = a[0];
		for(int i = 1; i < a.length; i++) {
			if(elemMenor.compareTo(a[i]) > 0)
				elemMenor = a[i];
		}
		return elemMenor;
			
	}
	
}