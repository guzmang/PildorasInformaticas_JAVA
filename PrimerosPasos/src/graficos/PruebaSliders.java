package graficos;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class PruebaSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSliders miMarco = new MarcoSliders();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoSliders extends JFrame {
	
	public MarcoSliders() {
		setBounds(550, 400, 550, 350);
		LaminaSliders miLamina = new LaminaSliders();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaSliders extends JPanel {
	
	public LaminaSliders() {
		// orientacion (opc), min, max, valor
		JSlider control = new JSlider(SwingConstants.VERTICAL, 0, 100, 50);
		control.setOrientation(SwingConstants.HORIZONTAL);
		control.setMajorTickSpacing(20);	// Espaciado mayor de los ticks
		control.setMinorTickSpacing(10);	// Espaciado menor de los ticks
		control.setPaintTicks(true);	// Dibuja los ticks
		control.setFont(new Font("Serif", Font.ITALIC, 12));	// Fuente de los nros
		control.setPaintLabels(true);	// Dibuja los numeros
		control.setSnapToTicks(true);	// Solo puedo seleccionar valores con ticks
		add(control);
	}
	
}