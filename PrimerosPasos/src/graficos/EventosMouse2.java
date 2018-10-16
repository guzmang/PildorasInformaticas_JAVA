package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class EventosMouse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMouse2 miMarco = new MarcoMouse2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMouse2 extends JFrame {
	
	public MarcoMouse2() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeMouse2 eventoMouse = new EventosDeMouse2();
		addMouseListener(eventoMouse);
	}
	
}

class EventosDeMouse2 extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Coordenada X: " + e.getX() + " - Coordenada Y: " + e.getY());
		System.out.println("Cantidad de clicks seguidos: " + e.getClickCount());
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK)
			System.out.println("Has pulsado el boton izquierdo");
		else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK)
			System.out.println("Has pulsado la rueda del mouse");
		else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK)
			System.out.println("Has pulsado el boton derecho");
	}
	
}