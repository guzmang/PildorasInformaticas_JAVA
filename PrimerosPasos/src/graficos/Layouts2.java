package graficos;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout2 miMarco = new MarcoLayout2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoLayout2 extends JFrame {
	
	public MarcoLayout2() {
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		PanelLayout2 lamina = new PanelLayout2();
		add(lamina);
	}
	
}

class PanelLayout2 extends JPanel {
	
	public PanelLayout2() {
		// las separaciones horizontal y vertical entre elementos son opcionales
		setLayout(new BorderLayout(10, 10));
		add(new JButton("Amarillo"), BorderLayout.NORTH);
		add(new JButton("Azul"), BorderLayout.SOUTH);
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
	
}