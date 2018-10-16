package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreandoMarco2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos2D miMarco = new MarcoConDibujos2D();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos2D extends JFrame {
	
	public MarcoConDibujos2D() {
		setVisible(true);
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		LaminaConFiguras2D miLamina = new LaminaConFiguras2D();
		add(miLamina);
	}
	
}

class LaminaConFiguras2D extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		double centroEnX = rectangulo.getCenterX();
		double centroEnY = rectangulo.getCenterY();
		double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);
		g2.draw(circulo);
	}
	
}