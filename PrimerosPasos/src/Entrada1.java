import java.util.Scanner;

public class Entrada1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre por favor: ");
		String nombreUsuario = entrada.nextLine();
		System.out.println("Introduzca su edad por favor: ");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendras "
				+ (edad+1) + " años.");
		entrada.close();
	}

}
