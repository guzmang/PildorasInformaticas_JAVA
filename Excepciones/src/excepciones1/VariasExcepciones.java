package excepciones1;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Es una mala practica de programacion atrapar errores que hereden de Exception
		try {
			division();
		} catch(ArithmeticException e) {
			System.out.println("Estas dividiendo por 0.");
		} catch(NumberFormatException e) {
			System.out.println("No has introducido un numero entero.");
			System.out.println(e.getMessage());
			System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
		}

	}

	static void division() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor: "));
		System.out.println("El resultado es: " + num1/num2);
	}
	
}
