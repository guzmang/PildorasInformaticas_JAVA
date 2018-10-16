package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoBotones extends JFrame {
	
	public MarcoBotones() {
		setTitle("Botones y eventos");
		setBounds(700, 300, 500, 300);
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
	}
	
}

class LaminaBotones extends JPanel implements ActionListener{
	
	JButton btnAzul = new JButton("Azul");
	JButton btnRojo = new JButton("Rojo");
	JButton btnAmarillo = new JButton("Amarillo");
	
	public LaminaBotones() {
		add(btnAzul);
		add(btnRojo);
		add(btnAmarillo);
		btnAzul.addActionListener(this);
		btnRojo.addActionListener(this);
		btnAmarillo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// Otra forma
//		switch (e.getActionCommand()) {
//			case "Azul":
//						setBackground(Color.blue);
//						break;
//			case "Amarillo":
//						setBackground(Color.yellow);
//						break;
//			case "Rojo":
//						setBackground(Color.red);
//						break;
//		}
		
		Object botonPulsado = e.getSource();
		if(botonPulsado == btnAzul)
			setBackground(Color.BLUE);
		else if(botonPulsado == btnRojo)
			setBackground(Color.RED);
		else
			setBackground(Color.YELLOW);
	}
	
}