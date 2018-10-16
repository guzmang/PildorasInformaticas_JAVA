package misApplets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class GraficoApplet extends JApplet {

	public void init() {
		int nro1 = Integer.parseInt(getParameter("barra.1"));
		int nro2 = Integer.parseInt(getParameter("barra.2"));
		int nro3 = Integer.parseInt(getParameter("barra.3"));
		LaminaGrafico miLamina = new LaminaGrafico(nro1, nro2, nro3);
		add(miLamina);
	}
	
}

class LaminaGrafico extends JPanel {
	
	public LaminaGrafico(int a, int b, int c) {
		h1 = a;
		h2 = b;
		h3 = c;
	}
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.rotate(180/180.0 * Math.PI, 125, 100);
		Rectangle2D graf1 = new Rectangle2D.Double(50, 0, 50, h1);
		Rectangle2D graf2 = new Rectangle2D.Double(100, 0, 50, h2);
		Rectangle2D graf3 = new Rectangle2D.Double(150, 0, 50, h3);
		g2.setPaint(Color.RED);
		g2.fill(graf1);
		g2.setPaint(Color.YELLOW);
		g2.fill(graf2);
		g2.setPaint(Color.GREEN);
		g2.fill(graf3);
	}
	
	private int h1, h2, h3;
	
}
