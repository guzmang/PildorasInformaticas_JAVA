package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConColor miMarco = new MarcoConColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConColor extends JFrame {
	
	public MarcoConColor() {
		setVisible(true);
		setTitle("Prueba con colores");
		setSize(400, 400);
		LaminaConColor miLamina = new LaminaConColor();
		add(miLamina);
		// la constante utilizada toma el color de las ventanas del SO anfitrion
		miLamina.setBackground(SystemColor.window);
	}
	
}

class LaminaConColor extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		// o setColor(Color color) de la clase Graphics
		// setPaint es de Graphics2D
		g2.setPaint(Color.BLUE);
		g2.draw(rectangulo);
		// o setColor(Color color) de la clase Graphics
		// darker() oscurece el color, se puede aplicar mas de una vez
		g2.setPaint(Color.RED.darker());
		g2.fill(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		// brighter() aumenta el brillo del color, se puede aplicar mas de una vez
		g2.setPaint(new Color(0, 140, 255).brighter());
		g2.fill(elipse);
	}
	
}