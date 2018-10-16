package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaDisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre miMarco = new MarcoLibre();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre extends JFrame {
	
	public MarcoLibre() {
		setBounds(450, 350, 600, 400);
		LaminaLibre miLamina = new LaminaLibre();
		add(miLamina);
		setVisible(true);
	}

}

class LaminaLibre extends JPanel {
	
	public LaminaLibre() {
		setLayout(null);	// Indico una disposicion libre con null

//		JButton boton1 = new JButton("Boton 1");
//		JButton boton2 = new JButton("Boton 2");
//		boton1.setBounds(50, 50, 150, 50);
//		boton2.setBounds(200, 100, 150, 50);
//		add(boton1);
//		add(boton2);
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JTextField cNombre = new JTextField();
		JTextField cApellido = new JTextField();
		nombre.setBounds(20, 20, 80, 10);
		cNombre.setBounds(100, 15, 100, 20);
		apellido.setBounds(20, 60, 80, 15);
		cApellido.setBounds(100, 55, 100, 20);
		add(nombre);
		add(apellido);
		add(cNombre);
		add(cApellido);
	}
	
}