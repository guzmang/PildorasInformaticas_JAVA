package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficoBarras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoGrafico miMarco = new MarcoGrafico();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}
	
}

class MarcoGrafico extends JFrame {
	
	public MarcoGrafico() {
		setBounds(250, 400, 300, 400);
		LaminaGrafico miLamina = new LaminaGrafico();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaGrafico extends JPanel {
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.rotate(180/180.0 * Math.PI, 125, 100);
		Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, 50);
		Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, 75);
		Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, 100);
		g2.setPaint(Color.RED);
		g2.fill(graf1);
		g2.setPaint(Color.YELLOW);
		g2.fill(graf2);
		g2.setPaint(Color.GREEN);
		g2.fill(graf3);
	}
	
}
