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

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoProcesador miMarco = new MarcoProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoProcesador extends JFrame {
	
	public MarcoProcesador() {
		setBounds(500, 300, 550, 400);
		LaminaProcesador miLamina = new LaminaProcesador();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaProcesador extends JPanel {
	
	public LaminaProcesador() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamanio = new JMenu("Tamaño");
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem courier = new JMenuItem("Courier");
		arial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			miArea.setFont(new Font("Arial", Font.PLAIN, 12));
		}
		});
//		GestionaMenus tipoLetra = new GestionaMenus();
//		courier.addActionListener(tipoLetra);
		courier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			miArea.setFont(new Font("Courier", Font.PLAIN, 12));
		}
		});
		JMenuItem verdana = new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			miArea.setFont(new Font("Verdana", Font.PLAIN, 12));
		}
		});
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		estilo.add(negrita);
		estilo.add(cursiva);
		JMenuItem tam12 = new JMenuItem("12");
		JMenuItem tam16 = new JMenuItem("16");
		JMenuItem tam20 = new JMenuItem("20");
		JMenuItem tam24 = new JMenuItem("24");
		tamanio.add(tam12);
		tamanio.add(tam16);
		tamanio.add(tam20);
		tamanio.add(tam24);
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamanio);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	
//	private class GestionaMenus implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			miArea.setFont(new Font("Courier", Font.PLAIN, 12));
//		}
//		
//	}
	
	private JTextPane miArea;
	
}