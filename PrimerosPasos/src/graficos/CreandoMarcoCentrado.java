package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setLocationRelativeTo(null);	// ubica el marco en el centro
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		// Toolkit: almacen de multitud de metodos que se comunican con el sistema huesped de ventanas	
		// almacenamos el sistema nativo de ventanas
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla = miPantalla.getScreenSize();
		int anchoPantalla = tamanioPantalla.width;
		int alturaPantalla = tamanioPantalla.height;
		setSize(anchoPantalla/2, alturaPantalla/2);
//		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Marco centrado");
		Image miIcono = miPantalla.getImage("src/graficos/icono.png");
		setIconImage(miIcono);
	}
	
}