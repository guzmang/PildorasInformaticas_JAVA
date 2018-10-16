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

public class EjemploRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadio miMarco = new MarcoRadio();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadio extends JFrame {
	
	public MarcoRadio() {
		setBounds(550, 300, 500, 350);
		LaminaRadio miLamina = new LaminaRadio();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaRadio extends JPanel {
	
	public LaminaRadio() {
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		texto.setFont(new Font("Serif", Font.PLAIN, 12));
		add(texto, BorderLayout.CENTER);
		ButtonGroup miGrupo = new ButtonGroup();
		boton1 = new JRadioButton("Pequeño", false);
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy grande", false);
		miGrupo.add(boton1);
		miGrupo.add(boton2);
		miGrupo.add(boton3);
		miGrupo.add(boton4);
		EventoRadio miEvento = new EventoRadio();
		boton1.addActionListener(miEvento);
		boton2.addActionListener(miEvento);
		boton3.addActionListener(miEvento);
		boton4.addActionListener(miEvento);
		JPanel laminaRadio = new JPanel();
		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		add(laminaRadio, BorderLayout.SOUTH);
	}
	
	private class EventoRadio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == boton1)
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
			else if(e.getSource() == boton2)
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
			else if(e.getSource() == boton3)
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
			else if(e.getSource() == boton4)
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
		}
		
	}
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	
}