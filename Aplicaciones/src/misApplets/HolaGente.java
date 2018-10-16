package misApplets;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HolaGente extends JApplet {

	// en vez de main se usa init, metodo heredado de Applet que estamos sobreescribiendo
	public void init() {
		JLabel rotulo = new JLabel("Hola Gente", SwingConstants.CENTER);
		add(rotulo);	// la agregamos al applet
	}
	
}
