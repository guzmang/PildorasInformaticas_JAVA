package graficos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PruebaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMenu miMarco = new MarcoMenu();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMenu extends JFrame {
	
	public MarcoMenu() {
		setBounds(500, 300, 550, 400);
		LaminaMenu miLamina = new LaminaMenu();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaMenu extends JPanel {
	
	public LaminaMenu() {
		JMenuBar miBarra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar como...");
		JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/graficos/cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/graficos/copiar.gif"));
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/graficos/pegar.gif"));
		
		// Por defecto los iconos estan a la izquierda del texto
		// Con estos metodos muevo el texto a la izquierda y los iconos a la derecha
//		cortar.setHorizontalTextPosition(SwingConstants.LEFT);
//		copiar.setHorizontalTextPosition(SwingConstants.LEFT);
//		pegar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem generales = new JMenuItem("Generales");
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		archivo.add(guardar);
		archivo.addSeparator();
		archivo.add(guardarComo);
		opciones.add(opcion1);
		opciones.addSeparator();
		opciones.add(opcion2);
		edicion.add(cortar);
		edicion.addSeparator();
		edicion.add(copiar);
		edicion.addSeparator();
		edicion.add(pegar);
		edicion.addSeparator();
		edicion.add(opciones);
		herramientas.add(generales);
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		add(miBarra);
	}
	
}