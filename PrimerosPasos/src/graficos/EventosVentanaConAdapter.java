package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventosVentanaConAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana2 miMarco = new MarcoVentana2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoVentana2 miMarco2 = new MarcoVentana2();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		miMarco.setTitle("Ventana 1");
		miMarco.setBounds(200, 300, 500, 350);
		miMarco2.setTitle("Ventana 2");
		miMarco2.setBounds(800, 300, 500, 350);
	}

}

class MarcoVentana2 extends JFrame {
	
	public MarcoVentana2() {
		setVisible(true);
		addWindowListener(new MVentana2());
	}
	
}

class MVentana2 extends WindowAdapter {
	
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	
}
