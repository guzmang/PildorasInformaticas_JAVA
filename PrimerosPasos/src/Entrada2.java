import javax.swing.JOptionPane;

public class Entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor:");
		String edad = JOptionPane.showInputDialog("Introduce edad nombre por favor:");
		int edadUsuario = Integer.parseInt(edad);
		System.out.println("Hola " + nombreUsuario + ". El año que viene tendras "
				+ (edadUsuario+1) + " años.");
	}

}
