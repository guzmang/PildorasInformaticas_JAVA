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

public class ProcesadorConToolBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador6 miMarco = new MarcoProcesador6();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador6 extends JFrame {
	
	public MarcoProcesador6() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador6 miLamina = new LaminaProcesador6();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador6 extends JPanel {
	
	public LaminaProcesador6() {
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
		
		JToolBar barra = new JToolBar();
		JButton negritaBarra = new JButton(new ImageIcon("src/graficos/negrita.gif"));
		JButton cursivaBarra = new JButton(new ImageIcon("src/graficos/cursiva.gif"));
		JButton subraBarra = new JButton(new ImageIcon("src/graficos/subrayado.gif"));
		JButton azulBarra = new JButton(new ImageIcon("src/graficos/bolaAzul.gif"));
		JButton amarBarra = new JButton(new ImageIcon("src/graficos/bolaAmar.gif"));
		JButton rojoBarra = new JButton(new ImageIcon("src/graficos/bolaRoja.gif"));
		JButton aIzquierda = new JButton(new ImageIcon("src/graficos/izquierda.gif"));
		JButton aCentrado = new JButton(new ImageIcon("src/graficos/centrado.gif"));
		JButton aDerecha = new JButton(new ImageIcon("src/graficos/derecha.gif"));
		JButton aJustificado = new JButton(new ImageIcon("src/graficos/justificado.gif"));
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subraBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("PoneAzul", Color.BLUE));
		amarBarra.addActionListener(new StyledEditorKit.ForegroundAction("PoneAmar", Color.YELLOW));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("PoneRojo", Color.RED));
		aIzquierda.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", StyleConstants.ALIGN_LEFT));
		aCentrado.addActionListener(new StyledEditorKit.AlignmentAction("Centrado", StyleConstants.ALIGN_CENTER));
		aDerecha.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", StyleConstants.ALIGN_RIGHT));
		aJustificado.addActionListener(new StyledEditorKit.AlignmentAction("Justificado", StyleConstants.ALIGN_JUSTIFIED));
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subraBarra);
		barra.add(azulBarra);
		barra.add(amarBarra);
		barra.add(rojoBarra);
		barra.add(aIzquierda);
		barra.add(aCentrado);
		barra.add(aDerecha);
		barra.add(aJustificado);
		barra.setOrientation(SwingConstants.VERTICAL);
		add(barra, BorderLayout.WEST);
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
	
}