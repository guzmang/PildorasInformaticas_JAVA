package graficos;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorConCheckBoxYRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador4 miMarco = new MarcoProcesador4();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador4 extends JFrame {
	
	public MarcoProcesador4() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador4 miLamina = new LaminaProcesador4();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador4 extends JPanel {
	
	public LaminaProcesador4() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");

		configuraMenu("Arial", "fuente", "Arial", 9, 10, "");
		configuraMenu("Courier", "fuente", "Courier", 9, 10, "");
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10, "");

		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/negrita.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/cursiva.gif"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);
		estilo.add(cursiva);
		
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
		}
	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamanio;
	
}