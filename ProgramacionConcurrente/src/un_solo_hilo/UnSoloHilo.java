package un_solo_hilo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UnSoloHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame marco = new MarcoRebote();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
	}

}

// Movimiento de la pelota
class Pelota {
	
	// Mueve la pelota invirtiendo posición si choca con límites
	public void muevePelota(Rectangle2D limites) {
		x += dx;
		y += dy;

		if(x < limites.getMinX()) {
			x = limites.getMinX();
			dx = -dx;
		}
		
		if(x + TAMX >= limites.getMaxX()) {
			x = limites.getMaxX() - TAMX;
			dx = -dx;
		}
		
		if(y < limites.getMinY()) {
			y = limites.getMinY();
			dy = -dy;
		}
		
		if(y + TAMY >= limites.getMaxY()) {
			y = limites.getMaxY() - TAMY;
			dy = -dy;
		}
		
	}
	
	//Forma de la pelota en su posición inicial
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, TAMX, TAMY);
	}
	
	private static final int TAMX = 15;
	private static final int TAMY = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;
	
}

//Lámina que dibuja las pelotas
class LaminaPelota extends JPanel {

	//Añadimos pelota a la lámina
	public void add(Pelota b) {
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(Pelota b: pelotas)
			g2.fill(b.getShape());
	}
	
	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
	
}

//Marco con lámina y botones

class MarcoRebote extends JFrame {
	
	public MarcoRebote() {
		setBounds(600, 300, 400, 350);
		setTitle("Rebotes");
		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);
		JPanel laminaBotones = new JPanel();
		ponerBoton(laminaBotones, "Dale!", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				comienzaElJuego();
			}
			
		});
		
		
		ponerBoton(laminaBotones, "Salir", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	//Ponemos botones
	public void ponerBoton(Container c, String titulo, ActionListener oyente) {
		JButton boton = new JButton(titulo);
		c.add(boton);
		boton.addActionListener(oyente);
	}
	
	//Añade pelota y la bota 1000 veces
	public void comienzaElJuego() {
		Pelota pelota=new Pelota();
		lamina.add(pelota);
		for(int i = 1; i <= 3000; i++) {
			pelota.muevePelota(lamina.getBounds());
			lamina.paint(lamina.getGraphics());
		}
	}
	
	private LaminaPelota lamina;
	
}