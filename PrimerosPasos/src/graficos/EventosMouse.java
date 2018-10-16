package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class EventosMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMouse miMarco = new MarcoMouse();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMouse extends JFrame {
	
	public MarcoMouse() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeMouse eventoMouse = new EventosDeMouse();
		addMouseListener(eventoMouse);
	}
	
}

class EventosDeMouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de salir");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de presionar");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Acabas de levantar");
	}
	
}