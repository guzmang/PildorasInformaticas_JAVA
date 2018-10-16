package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;

public class ProcesadorConMenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador5 miMarco = new MarcoProcesador5();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador5 extends JFrame {
	
	public MarcoProcesador5() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador5 miLamina = new LaminaProcesador5();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador5 extends JPanel {
	
	public LaminaProcesador5() {
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
		
		ButtonGroup tamanioLetra = new ButtonGroup();
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		tamanioLetra.add(doce);
		tamanioLetra.add(dieciseis);
		tamanioLetra.add(veinte);
		tamanioLetra.add(veinticuatro);
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", 24));
		tamanio.add(doce);
		tamanio.add(dieciseis);
		tamanio.add(veinte);
		tamanio.add(veinticuatro);
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamanio);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
		
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);
		miArea.setComponentPopupMenu(emergente);
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
			if(estilos == Font.BOLD){
				// La combinacion de teclas llamara al evento que fue asignado al JMenuItem
				// 1er arg: codigo de la tecla a presionar
				// 2do arg: codigo de la tecla que quiero utilizar junto al 1er arg
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			}
			else if(estilos == Font.ITALIC){
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}
	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamanio;
	
}