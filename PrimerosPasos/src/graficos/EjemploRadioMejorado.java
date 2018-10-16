package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EjemploRadioMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadioMejorado miMarco = new MarcoRadioMejorado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadioMejorado extends JFrame {
	
	public MarcoRadioMejorado() {
		setBounds(550, 300, 500, 350);
		LaminaRadioMejorado miLamina = new LaminaRadioMejorado();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaRadioMejorado extends JPanel {
	
	public LaminaRadioMejorado() {
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		miGrupo = new ButtonGroup();
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		add(texto, BorderLayout.CENTER);
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 24);
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	public void colocarBotones(String nombre, boolean seleccionado, int tamanio) {
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		ActionListener miEvento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif", Font.PLAIN, tamanio));
			}
			
		};
		boton.addActionListener(miEvento);
		miGrupo.add(boton);
		laminaBotones.add(boton);
	}
	
	private JLabel texto;
	private JPanel laminaBotones;
	private ButtonGroup miGrupo;
	
}