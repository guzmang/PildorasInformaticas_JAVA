package excepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		Scanner entrada=new Scanner (System.in);		
		int decision=entrada.nextInt();
		
		if (decision==1)
			pedirDatos();
		else{
			System.out.println("Adios");
			System.exit(0);
		}
		
		entrada.close();
	}
	
	// No es una buena practica hacerlo de esta forma ya que se puede optimizar
	// con una solucion mejor
	// No tiene mucho sentido que el metodo lance una excepcion y el mismo lo trate
	static void pedirDatos() throws InputMismatchException {
		// Al no ser una exception del tipo IOException no es obligatorio usar
		// un bloque try catch
		try {
			Scanner entrada=new Scanner(System.in);
			System.out.println("Introduce tu nombre, por favor");
			String nombre_usuario=entrada.nextLine();
			System.out.println("Introduce edad, por favor");
		
			int edad=entrada.nextInt();	
			System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + 
			(edad+1) + " años");
			entrada.close();
			// Puedo poner otro arg en clase que sea de una clase superior a la indicada
			// como RuntimeException o Exception y seguira funcionando
		} catch (InputMismatchException e) {
			System.out.println("Que demonios has ingresado?");
		}
		// Siempre se ejecuta esta ultima linea
		System.out.println("Hemos terminado");		
	}

}
