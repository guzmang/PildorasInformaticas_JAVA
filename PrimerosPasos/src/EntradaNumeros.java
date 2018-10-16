import javax.swing.JOptionPane;


public class EntradaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 10000.0;
		System.out.printf("%1.2f", x/3);
		System.out.println();		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		double num2 = Double.parseDouble(num1);
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.4f", Math.sqrt(num2));
	}

}
