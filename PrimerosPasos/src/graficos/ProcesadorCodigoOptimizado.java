package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

public class ProcesadorCodigoOptimizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador7 miMarco = new MarcoProcesador7();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador7 extends JFrame {
	
	public MarcoProcesador7() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador7 miLamina = new LaminaProcesador7();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador7 extends JPanel {
	
	public LaminaProcesador7() {
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
		
		barra = new JToolBar();
		configuraBarra("src/graficos/negrita.gif").addActionListener(new StyledEditorKit.BoldAction());
		configuraBarra("src/graficos/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("src/graficos/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		barra.addSeparator();
		configuraBarra("src/graficos/bolaAzul.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneAzul", Color.BLUE));
		configuraBarra("src/graficos/bolaAmar.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneAmar", Color.YELLOW));
		configuraBarra("src/graficos/bolaRoja.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneRojo", Color.RED));
		barra.addSeparator();
		configuraBarra("src/graficos/izquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", StyleConstants.ALIGN_LEFT));
		configuraBarra("src/graficos/centrado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", StyleConstants.ALIGN_CENTER));
		configuraBarra("src/graficos/derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", StyleConstants.ALIGN_RIGHT));
		configuraBarra("src/graficos/justificado.gif").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", StyleConstants.ALIGN_JUSTIFIED));
		barra.setOrientation(SwingConstants.VERTICAL);
		add(barra, BorderLayout.WEST);
	}
	
	public JButton configuraBarra(String ruta) {
		JButton boton = new JButton(new ImageIcon(ruta));
		barra.add(boton);
		return boton;
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
	private JToolBar barra;

}