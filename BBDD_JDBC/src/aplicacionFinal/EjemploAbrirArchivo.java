package aplicacionFinal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EjemploAbrirArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Por defecto al abrir la ventana, la ruta por default es en Documents
		// Si se quiere otra ruta, hay que especificarselo al constructor con un String
	    JFileChooser chooser = new JFileChooser();
	    
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "JPG & GIF Images", "jpg", "gif");
	    
	    chooser.setFileFilter(filter);
	    
	    int returnVal = chooser.showOpenDialog(miMarco);
	    
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	       System.out.println("Absolute Path: " +
	    		chooser.getSelectedFile().getAbsolutePath());
	    }
	}

}

class Marco extends JFrame {
	
	public Marco() {
		setBounds(300, 300, 300, 300);
		setVisible(true);
	}
	
}