package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout3 miMarco = new MarcoLayout3();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoLayout3 extends JFrame {
	
	public MarcoLayout3() {
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		PanelLayout3 lamina = new PanelLayout3();
		OtroPanelLayout lamina2 = new OtroPanelLayout();
		add(lamina, BorderLayout.NORTH);
		add(lamina2, BorderLayout.SOUTH);
	}
	
}

class PanelLayout3 extends JPanel {
	
	public PanelLayout3() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
	}
	
}

class OtroPanelLayout extends JPanel {
	
	public OtroPanelLayout() {
		setLayout(new BorderLayout());
		add(new JButton("Rojo"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
	}
	
}