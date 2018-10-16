package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCombo miMarco = new MarcoCombo();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCombo extends JFrame {
	
	public MarcoCombo() {
		setBounds(550, 300, 550, 400);
		LaminaCombo miLamina = new LaminaCombo();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaCombo extends JPanel {
	
	public LaminaCombo() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		JPanel laminaNorte = new JPanel();
		miCombo = new JComboBox<String>();
		// Puedo habilitar el campo para poner mi tipo de letra y con enter que se convierta
//		miCombo.setEditable(true);
		miCombo.addItem("Serif");
		miCombo.addItem("SansSerif");
		miCombo.addItem("Monospaced");
		miCombo.addItem("Dialog");
		EventoCombo miEvento = new EventoCombo();
		miCombo.addActionListener(miEvento);
		laminaNorte.add(miCombo);
		add(laminaNorte, BorderLayout.NORTH);
	}
	
	private class EventoCombo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font(miCombo.getSelectedItem().toString(), Font.PLAIN, 18));
		}
		
	}
	
	private JLabel texto;
	private JComboBox<String> miCombo;
	
}