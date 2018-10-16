package excepciones1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AreasPeso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo\n"
				+ "3: Triangulo \n4: Circulo");
		try {
			figura = entrada.nextInt();
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error.");
		} finally {
			entrada.close();	// puede ir aca normalmente porque despues dejamos de usarlo
		}
		switch(figura){
		case 1: 
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.print("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.print("El area del rectangulo es: " + base*altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.print("El area del triangulo es: " + (base*altura)/2);
			break;
		case 4: 
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.print("La opcion no es correcta.");
		}
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm."));
		System.out.println("\nSi sos hombre tu peso ideal es: " + (altura-110) + "kg.");
		System.out.println("Si sos mujer tu peso ideal es: " + (altura-120) + "kg.");
	}

	static int figura;
	
}
