package principal;

import javax.swing.JFrame;

import vista.MarcoAplicacion;

public class EjecutaModeloVistaControlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAplicacion miMarco = new MarcoAplicacion();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}
