package excepciones1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeerImagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen mimarco=new MarcoImagen();		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoImagen extends JFrame{
	
	
	public MarcoImagen(){
		setTitle("Marco Con Imagen");
		setBounds(750,300,300,200);
		LaminaConImagen milamina=new LaminaConImagen();
		add(milamina);
	}
	
}

class LaminaConImagen extends JPanel{
	
	// Al estar la posibilidad de una IOException estamos obligados
	// a capturar la excepcion con un bloque try catch
	public LaminaConImagen(){
		try{
			imagen = ImageIO.read(new File("src/excepciones1/bola.png"));
		}catch(IOException e){
			System.out.println("La imagen no se encuentra");
		}
	}
	
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		if(imagen == null)
			g.drawString("No pudimos cargar la imagen", 10, 10);
		else{
			int anchuraImagen=imagen.getWidth(this);
			int alturaImagen=imagen.getHeight(this);
			g.drawImage(imagen, 0, 0, null);
		
			for(int i = 0; i < 300; i++){
				for(int j = 0; j < 200; j++)
					if(i + j >0)
						g.copyArea(0, 0, anchuraImagen, alturaImagen, 
								anchuraImagen * i, alturaImagen * j);
			}
		}
	}

	// Otra forma:
	// Nota: es mala practica usar un try catch en una excepcion que no sea IOException
//	public void paintComponent(Graphics g) throws NullPointerException {	
//		super.paintComponent(g);
//		try {
//			int anchuraImagen=imagen.getWidth(this);
//			int alturaImagen=imagen.getHeight(this);
//			g.drawImage(imagen, 0, 0, null);
//		
//			for(int i = 0; i < 300; i++){
//				for(int j = 0; j < 200; j++)
//					if(i + j >0)
//						g.copyArea(0, 0, anchuraImagen, alturaImagen, 
//								anchuraImagen * i, alturaImagen * j);
//			}
//		} catch (NullPointerException e) {
//			g.drawString("No pudimos cargar la imagen", 10, 10);
//		}
//	}
	
	private Image imagen;
	
}