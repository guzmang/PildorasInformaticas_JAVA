package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes miMarco = new MarcoConFuentes();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConFuentes extends JFrame {

	public MarcoConFuentes(){
		setTitle("Prueba con fuentes");
		setSize(400, 400);
		LaminaConFuentes miLamina = new LaminaConFuentes();
		add(miLamina);
		// si agregamos la linea debajo y quitamos los setColor,
		// en la lamina se dibujaran los elementos que contenga
		// con el color que indiquemos en setForeground(Color c)
		//miLamina.setForeground(Color.RED);
	}
	
}

class LaminaConFuentes extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		// Si la fuente no existe, usa la que esta por defecto
		Font miFuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(miFuente);
		g2.setColor(Color.BLUE);
		g2.drawString("German", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 24));
		g2.setColor(new Color(128, 90, 50).brighter());
		g2.drawString("Curso de Java", 100, 200);
	}
	
}