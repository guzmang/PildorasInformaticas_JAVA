import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RecursosJAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRecursos miMarco = new MarcoRecursos();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoRecursos extends JFrame {
	
	public MarcoRecursos() {
		setTitle("Prueba de recursos");
		setBounds(300, 300, 300, 300);
		add(new LaminaRecursos());
	}
	
}

class LaminaRecursos extends JPanel {
	
	public LaminaRecursos() {
		setLayout(new BorderLayout());
		zonaTexto = new JTextArea();
		add(new JScrollPane(zonaTexto), BorderLayout.CENTER);
		// Reflexion: getResource carga los recursos señalados en la clase
		// El archivo verde.gif podria haber estado dentro de una carpeta
		URL rutaBtn = LaminaRecursos.class.getResource("verde.gif");
//		JButton btnAcercaDe = new JButton("Dale!", new ImageIcon("bin/verde.gif"));
		JButton btnAcercaDe = new JButton("Dale!", new ImageIcon(rutaBtn));
		// Una vez generado el JAR ejecutable, habra que agregar la imagen
		// de forma manual al JAR generado
		btnAcercaDe.addActionListener(new AccionBoton());
		add(btnAcercaDe, BorderLayout.SOUTH);
	}
	
	private class AccionBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("El boton funciona");
		}
		
	}
	
	private JTextArea zonaTexto;
	
}