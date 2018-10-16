package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones2 extends JFrame {
	
	public MarcoBotones2() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones2 miLamina = new LaminaBotones2();
		add(miLamina);
	}
	
}

class LaminaBotones2 extends JPanel {
	
	JButton btnAzul = new JButton("Azul");
	JButton btnRojo = new JButton("Rojo");
	JButton btnAmarillo = new JButton("Amarillo");
	
	public LaminaBotones2() {
		add(btnAzul);
		add(btnRojo);
		add(btnAmarillo);
		ColorFondo azul = new ColorFondo(Color.BLUE);
		ColorFondo rojo = new ColorFondo(Color.RED);
		ColorFondo amarillo = new ColorFondo(Color.YELLOW);
		btnAzul.addActionListener(azul);
		btnRojo.addActionListener(rojo);
		btnAmarillo.addActionListener(amarillo);
	}

	class ColorFondo implements ActionListener {
		
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
	}
	
}