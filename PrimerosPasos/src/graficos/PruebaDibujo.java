package graficos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos() {
		setVisible(true);
		setTitle("Prueba de dibujo");
		setSize(400, 400);
		LaminaConFiguras miLamina = new LaminaConFiguras();
		add(miLamina);
	}
	
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);
		g.drawLine(60, 60, 240, 120);
		g.drawArc(100, 100, 100, 200, 100, 100);
	}
	
}