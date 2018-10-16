package graficos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SintaxisRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadioSintaxis miMarco = new MarcoRadioSintaxis();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadioSintaxis extends JFrame {
	
	public MarcoRadioSintaxis() {
		setBounds(550, 300, 550, 300);
		LaminaRadioSintaxis miLamina = new LaminaRadioSintaxis();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaRadioSintaxis extends JPanel {
	
	public LaminaRadioSintaxis() {
		// El grupo no se puede agregar a la lamina, se agregan los botones
		ButtonGroup miGrupo1 = new ButtonGroup();
		ButtonGroup miGrupo2 = new ButtonGroup();
		JRadioButton boton1 = new JRadioButton("Azul", false);
		JRadioButton boton2 = new JRadioButton("Rojo", true);
		JRadioButton boton3 = new JRadioButton("Verde", false);
		JRadioButton boton4 = new JRadioButton("Masculino", false);
		JRadioButton boton5 = new JRadioButton("Femenino", false);
		miGrupo1.add(boton1);
		miGrupo1.add(boton2);
		miGrupo1.add(boton3);
		miGrupo2.add(boton4);
		miGrupo2.add(boton5);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
	}
	
}