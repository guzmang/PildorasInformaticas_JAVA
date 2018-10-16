package graficos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaImagen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConImagen2 miMarco = new MarcoConImagen2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConImagen2 extends JFrame {

	public MarcoConImagen2(){
		setTitle("Marco con imagen");
		setBounds(750, 300, 300, 200);
		LaminaConImagen2 miLamina = new LaminaConImagen2();
		add(miLamina);
	}
	
}

class LaminaConImagen2 extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		try{
			imagen = ImageIO.read(new File("src/graficos/bola.png"));
			int anchoImagen = imagen.getWidth(this);
			int altoImagen = imagen.getHeight(this);
			g.drawImage(imagen, 0, 0, null);
			
			for(int i = 0; i < 300; i++)
				for(int j = 0; j < 200; j++)
					if((i+j) > 0)
						g.copyArea(0, 0, anchoImagen, altoImagen,
								i*anchoImagen, j*altoImagen);
			
		} catch (IOException e){
			System.out.println("La imagen no se encuentra.");
		}
	}
	
	private Image imagen;
	
}