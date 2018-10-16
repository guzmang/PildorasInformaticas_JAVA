package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorStyledEditorKit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador3 miMarco = new MarcoProcesador3();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador3 extends JFrame {
	
	public MarcoProcesador3() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador3 miLamina = new LaminaProcesador3();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador3 extends JPanel {
	
	public LaminaProcesador3() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");

		configuraMenu("Arial", "fuente", "Arial", 9, 10, "");
		configuraMenu("Courier", "fuente", "Courier", 9, 10, "");
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10, "");

		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1, "src/graficos/negrita.gif");
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "src/graficos/cursiva.gif");

		configuraMenu("12", "tamaño", "", 9, 12, "");
		configuraMenu("16", "tamaño", "", 9, 16, "");
		configuraMenu("20", "tamaño", "", 9, 20, "");
		configuraMenu("24", "tamaño", "", 9, 24, "");
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamanio);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String rutaIcono) {
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(rutaIcono));
		if(menu.equals("fuente")){
			fuente.add(elemMenu);
			if(tipoLetra == "Arial")
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Arial"));
			else if(tipoLetra == "Courier")
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Courier"));
			else if(tipoLetra == "Verdana")
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", "Verdana"));
		} else if(menu.equals("estilo")){
			estilo.add(elemMenu);
			if(estilos == Font.BOLD)
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			else if(estilos == Font.ITALIC)
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
		} else if(menu.equals("tamaño")){
			tamanio.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", tam));
		}
	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamanio;
	
}