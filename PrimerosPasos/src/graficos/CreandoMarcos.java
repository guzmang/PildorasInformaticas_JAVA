package graficos;

import java.awt.Frame;

import javax.swing.JFrame;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MiMarco extends JFrame {
	
	public MiMarco () {
		
		// ancho / alto
//		setSize(500, 300);
		// x / y
//		setLocation(500, 300);
		// indico posicion y dimensiones
		setBounds(500, 300, 550, 250);
		// propiedad para redimensionar
		setResizable(false);
		// ampliar a pantalla completa (pero setResizable debe ser true)
		setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi ventana");
	}
	
}