package graficos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout miMarco = new MarcoLayout();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoLayout extends JFrame {
	
	public MarcoLayout() {
		setTitle("Prueba Acciones");
		setBounds(600, 350, 600, 300);
		PanelLayout lamina = new PanelLayout();
		// Por defecto es FlowLayout.CENTER que seria lo mismo que nada
		// Puedo elegir LEFT o RIGHT
		// 2do arg: separacion horizontal (opcional)
		// 3er arg: separacion vertical (opcional)
		FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER, 75, 100);
		lamina.setLayout(disposicion);
		add(lamina);
	}
	
}

class PanelLayout extends JPanel {
	
	public PanelLayout() {
		add(new JButton("Amarillo"));
		add(new JButton("Azul"));
		add(new JButton("Rojo"));
	}
	
}