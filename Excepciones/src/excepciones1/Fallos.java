package excepciones1;

import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miMatriz = new int[5];
		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
//		miMatriz[5] = 81;	// mas abajo la clase a la que pertenece el error
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//		at Excepciones1.Fallos.main(Fallos.java:15)
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + ": " + miMatriz[i]);
		}
		
		// Peticion de datos personales
		String nombre = JOptionPane.showInputDialog("Introduzca su nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
		System.out.println("Hola " + nombre + ", tiene " + edad + " años." + 
			" El programa terminó su ejecución.");
	}

}
