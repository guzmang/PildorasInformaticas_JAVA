import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JApplet;

public class AppletMultimedia extends JApplet {

	// getDocumentBase()
	// Devuelve el directorio donde se esta ejecutando la app
	public void init() {
		logo = getImage(getDocumentBase(), "logo.png");
	}
	
	public void paint(Graphics g) {
		g.drawImage(logo, 25, 25, this);
	}
	
	private Image logo;
	
}
