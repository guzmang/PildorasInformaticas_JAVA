package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class PruebaSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpinner miMarco = new MarcoSpinner();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoSpinner extends JFrame {
	
	public MarcoSpinner() {
		setBounds(550, 350, 550, 350);
		add(new LaminaSpinner());
	}
	
}

class LaminaSpinner extends JPanel {
	
	public LaminaSpinner() {
		String lista[] = GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames();
		// Spiner con array de Strings (y dimension indicada)
		JSpinner control1 = new JSpinner(new SpinnerListModel(lista));
		Dimension d = new Dimension(150, 20);
		control1.setPreferredSize(d);
		add(control1);
		// Spinner con fechas
		JSpinner control2 = new JSpinner(new SpinnerDateModel());
		add(control2);
		// Spinner con constructor de numeros
		// valor inicial, minimo, maximo, intervalos
		JSpinner control3 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 2));
		add(control3);
	}
	
}