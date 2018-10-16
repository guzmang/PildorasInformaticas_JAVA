package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaJTextFieldDocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrueba miMarco = new MarcoPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPrueba extends JFrame {
	
	public MarcoPrueba() {
		setBounds(500, 300, 500, 350);
		LaminaPrueba miLamina = new LaminaPrueba();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaPrueba extends JPanel {
	
	public LaminaPrueba() {
		JTextField miCampo = new JTextField(20);
		EscuchaTexto elEvento = new EscuchaTexto();
		Document miDoc = miCampo.getDocument();
		miDoc.addDocumentListener(elEvento);
		add(miCampo);
	}
	
	private class EscuchaTexto implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has borrado texto");
		}
		
	}
	
}