package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class EventosMouse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMouse3 miMarco = new MarcoMouse3();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMouse3 extends JFrame {
	
	public MarcoMouse3() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeMouse3 eventoMouse = new EventosDeMouse3();
		addMouseMotionListener(eventoMouse);
	}
	
}

class EventosDeMouse3 implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Estas moviendo");
	}

	

}