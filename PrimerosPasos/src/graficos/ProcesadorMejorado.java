package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class ProcesadorMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador2 miMarco = new MarcoProcesador2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador2 extends JFrame {
	
	public MarcoProcesador2() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador2 miLamina = new LaminaProcesador2();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador2 extends JPanel {
	
	public LaminaProcesador2() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamanio = new JMenu("Tamaño");

		configuraMenu("Arial", "fuente", "Arial", 9, 10);
		configuraMenu("Courier", "fuente", "Courier", 9, 10);
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10);

		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1);
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1);

		configuraMenu("12", "tamaño", "", 9, 12);
		configuraMenu("16", "tamaño", "", 9, 16);
		configuraMenu("20", "tamaño", "", 9, 20);
		configuraMenu("24", "tamaño", "", 9, 24);
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamanio);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		JMenuItem elemMenu = new JMenuItem(rotulo);
		if(menu.equals("fuente"))
			fuente.add(elemMenu);
		else if(menu.equals("estilo"))
			estilo.add(elemMenu);
		else if(menu.equals("tamaño"))
			tamanio.add(elemMenu);
		
		elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tam));
	}
	
	private class GestionaEventos implements ActionListener {

		String tipoTexto, menu;
		int estiloLetra, tamanioLetra;
		
		public GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra) {
			tipoTexto = texto2;
			estiloLetra = estilo2;
			tamanioLetra = tamLetra;
			menu = elemento;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			letras = miArea.getFont();

			if(menu == "Arial" || menu == "Courier" || menu == "Verdana"){
				estiloLetra = letras.getStyle();
				tamanioLetra = letras.getSize();
			} else if(menu == "Cursiva" || menu == "Negrita"){
//				if(letras.getStyle() == 1 || letras.getStyle() == 2)
//					estiloLetra = 3;
				tipoTexto = letras.getFontName();
				tamanioLetra = letras.getSize();
			} else if(menu == "12" || menu == "16" || menu == "20" || menu == "24"){
				estiloLetra = letras.getStyle();
				tipoTexto = letras.getFontName();
			}
			
			miArea.setFont(new Font(tipoTexto, estiloLetra, tamanioLetra));
			System.out.println("Tipo: " + tipoTexto + " Estilo: " + estiloLetra + " Tamaño: " + tamanioLetra);
		}
		
	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamanio;
	private Font letras;
	
}