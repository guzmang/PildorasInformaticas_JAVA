package misApplets;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class GraficoMejorado extends JApplet {

	public void init() {
		int nroBarras = Integer.parseInt(getParameter("graficos"));
		int arrayGraficos[] = new int[nroBarras];
		for(int i = 0; i < arrayGraficos.length; i++)
			arrayGraficos[i] = Integer.parseInt(getParameter("barra." + (i+1)));
		LaminaGrafico2 miLamina = new LaminaGrafico2(arrayGraficos);
		add(miLamina);
	}
	
}

class LaminaGrafico2 extends JPanel {
	
	public LaminaGrafico2(int valores[]) {
		valoresGraficos = valores;
	}
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.rotate(180/180.0 * Math.PI, 125, 100);
		int posX = 0;
		for(int i = 0; i < valoresGraficos.length; i++){
			Rectangle2D graf = new Rectangle2D.Double(posX, 0, 50, valoresGraficos[i]);
			int colorRojo = (int) Math.round(Math.random()*200);
			int colorVerde = (int) Math.round(Math.random()*200);
			int colorAzul = new Random().nextInt(256);	// nro entre 0 y 255
			Color colorBarra = new Color(colorRojo, colorVerde, colorAzul);
			g2.setPaint(colorBarra);
			g2.fill(graf);
			posX += 50;
		}
	}
	
	private int[] valoresGraficos;
	
}
