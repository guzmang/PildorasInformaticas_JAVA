package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCheck miMarco = new MarcoCheck();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCheck extends JFrame {
	
	public MarcoCheck() {
		setBounds(550, 300, 550, 350);
		LaminaCheck miLamina = new LaminaCheck();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaCheck extends JPanel {
	
	public LaminaCheck() {
		setLayout(new BorderLayout());
		Font miLetra = new Font("Serif", Font.PLAIN, 18);
		texto = new JLabel("En un lugar de la mancha de cuyo nombre no quiero acordarme...");
		texto.setFont(miLetra);
		JPanel laminaTexto = new JPanel();
		laminaTexto.add(texto);
		add(laminaTexto, BorderLayout.CENTER);
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel laminaChecks = new JPanel();
		laminaChecks.add(check1);
		laminaChecks.add(check2);
		add(laminaChecks, BorderLayout.SOUTH);
	}

	private class ManejaChecks implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int tipo = 0;
			if(check1.isSelected())
				tipo += Font.BOLD;
			if(check2.isSelected())
				tipo += Font.ITALIC;
			texto.setFont(new Font("Serif", tipo, 18));
		}
		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;
}