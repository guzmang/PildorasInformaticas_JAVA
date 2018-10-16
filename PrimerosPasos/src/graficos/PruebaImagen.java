package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConImagen miMarco = new MarcoConImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConImagen extends JFrame {

	public MarcoConImagen(){
		setTitle("Marco con imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
	
}

class LaminaConImagen extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		File miImagen = new File("src/graficos/coche.png");
		try{
			imagen = ImageIO.read(miImagen);	
		} catch (IOException e){
			System.out.println("La imagen no se encuentra.");
		}
		System.out.println("Con o sin excepcion paso por aca.");
		g.drawImage(imagen, 5, 5, null);
	}
	
	private Image imagen;
	
}