package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCalculadora miMarco = new MarcoCalculadora();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora() {
		setTitle("Calculadora");
		setBounds(500, 300, 450, 300);
		LaminaCalculadora miLamina = new LaminaCalculadora();
		add(miLamina);
//		pack();		// metodo que adapta la ventana al tamaño por defecto de los componentes que contiene
	}
	
}

class LaminaCalculadora extends JPanel {
	
	public LaminaCalculadora() {
		principio = true;
		setLayout(new BorderLayout());
		pantalla = new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
		miLamina2 = new JPanel();
		miLamina2.setLayout(new GridLayout(4, 4));
		
//		JButton btn1 = new JButton("1");
//		miLamina2.add(btn1);
//		JButton btn2 = new JButton("2");
//		miLamina2.add(btn2);
//		JButton btn3 = new JButton("3");
//		miLamina2.add(btn3);
//		JButton btn4 = new JButton("4");
//		miLamina2.add(btn4);
//		
//		JButton btn5 = new JButton("5");
//		miLamina2.add(btn5);
//		JButton btn6 = new JButton("6");
//		miLamina2.add(btn6);
//		JButton btn7 = new JButton("7");
//		miLamina2.add(btn7);
//		JButton btn8 = new JButton("8");
//		miLamina2.add(btn8);
//		
//		JButton btn9 = new JButton("9");
//		miLamina2.add(btn9);
//		JButton btnIgual = new JButton("=");
//		miLamina2.add(btnIgual);
//		JButton btnPor = new JButton("*");
//		miLamina2.add(btnPor);
//		JButton btnMas = new JButton("+");
//		miLamina2.add(btnMas);
//		
//		JButton btnComa = new JButton(".");
//		miLamina2.add(btnComa);
//		JButton btnDividir = new JButton("/");
//		miLamina2.add(btnDividir);
//		JButton btnResta = new JButton("-");
//		miLamina2.add(btnResta);
//		JButton btn99 = new JButton("");
//		miLamina2.add(btn99);
		
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);
		
		add(miLamina2, BorderLayout.CENTER);
		ultimaOperacion = "=";
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);
		miLamina2.add(boton);
	}
	
	private class InsertaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
			if(principio){
				pantalla.setText("");
				principio = false;
			}
			pantalla.setText(pantalla.getText() + entrada);
		}
		
	}
	
	private class AccionOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			principio = true;
		}
		
		public void calcular(double x) {
			if(ultimaOperacion.equals("+"))
				resultado += x;
			else if(ultimaOperacion.equals("-"))
				resultado -= x;
			else if(ultimaOperacion.equals("*"))
				resultado *= x;
			else if(ultimaOperacion.equals("/"))
				resultado /= x;
			else if(ultimaOperacion.equals("="))
				resultado = x;
			pantalla.setText(Double.toString(resultado));
		}
		
	}
	
	private JPanel miLamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
	
}