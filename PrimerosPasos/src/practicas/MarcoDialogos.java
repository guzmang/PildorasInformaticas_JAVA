package practicas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MarcoDialogos extends JFrame {

	public MarcoDialogos() {
		setTitle("Prueba de diálogos");
		setBounds(500, 300, 600, 450);
		JPanel laminaCuadricula = new JPanel();
		laminaCuadricula.setLayout(new GridLayout(2, 3));
		laminaTipo = new LaminaBotones("Tipo", new String[] {
				"Mensaje", 
				"Confirmar", 
				"Opción", 
				"Entrada"
		});
		laminaTipoMensaje = new LaminaBotones("Tipo de Mensaje", new String[] {
				"ERROR_MESSAGE", 
				"INFORMATION_MESSAGE", 
				"WARNING_MESSAGE", 
				"QUESTION_MESSAGE", 
				"PLAIN_MESSAGE"
		});
		laminaMensaje = new LaminaBotones("Mensaje", new String[] {
				"Cadena", 
				"Icono", 
				"Componente", 
				"Otros", 
				"Object[]"
		});
		laminaTipoOpcion = new LaminaBotones("Confirmar", new String[] {
				"DEFAULT_OPTION", 
				"YES_NO_OPTION", 
				"YES_NO_CANCEL_OPTION", 
				"OK_CANCEL_OPTION"
		});
		laminaOpciones = new LaminaBotones("Opción", new String[] {
				"String[]", 
				"Icon[]", 
				"Object[]"
		});
		laminaEntrada = new LaminaBotones("Entrada", new String[] {
				"Campo de texto", 
				"Combo"
		});
		
		setLayout(new BorderLayout());
		
		laminaCuadricula.add(laminaTipo);
		laminaCuadricula.add(laminaTipoMensaje);
		laminaCuadricula.add(laminaMensaje);
		laminaCuadricula.add(laminaTipoOpcion);
		laminaCuadricula.add(laminaOpciones);
		laminaCuadricula.add(laminaEntrada);
		
		JPanel laminaMostrar = new JPanel();
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new AccionMostrar());
		laminaMostrar.add(btnMostrar);
		
		add(laminaCuadricula, BorderLayout.CENTER);
		add(laminaMostrar, BorderLayout.SOUTH);
	}
	
	public Object dameMensaje() {
		String s = laminaMensaje.dameSeleccion();
		if(s.equals("Cadena"))
			return cadenaMensaje;
		else if(s.equals("Icono"))
			return iconoMensaje;
		else if(s.equals("Componente"))
			return componenteMensaje;
		else if(s.equals("Otros"))
			return objetoMensaje;
		else if(s.equals("Object[]"))
			return new Object[]{cadenaMensaje,
								iconoMensaje, 
								componenteMensaje, 
								objetoMensaje};
		else
			return null;
	}
	
	public int dameIcono() {
		String s = laminaTipoMensaje.dameSeleccion();
		if(s.equals("ERROR_MESSAGE"))
			return JOptionPane.ERROR_MESSAGE;
		else if(s.equals("INFORMATION_MESSAGE"))
			return JOptionPane.INFORMATION_MESSAGE;
		else if(s.equals("WARNING_MESSAGE"))
			return JOptionPane.WARNING_MESSAGE;
		else if(s.equals("QUESTION_MESSAGE"))
			return JOptionPane.QUESTION_MESSAGE;
		else if(s.equals("PLAIN_MESSAGE"))
			return JOptionPane.PLAIN_MESSAGE;
		else
			return 0;
	}
	
	public int dameTipo() {
		String s = laminaTipoOpcion.dameSeleccion();
		if(s.equals("DEFAULT_OPTION"))
			return JOptionPane.DEFAULT_OPTION;
		else if(s.equals("YES_NO_OPTION"))
			return JOptionPane.YES_NO_OPTION;
		else if(s.equals("YES_NO_CANCEL_OPTION"))
			return JOptionPane.YES_NO_CANCEL_OPTION;
		else if(s.equals("OK_CANCEL_OPTION"))
			return JOptionPane.OK_CANCEL_OPTION;
		else
			return JOptionPane.DEFAULT_OPTION;
	}
	
	public Object[] dameOpciones(LaminaBotones lamina) {
		String s = lamina.dameSeleccion();
		if(s.equals("String[]"))
			return new String[] {"Amarillo", "Azul", "Rojo"};
		else if(s.equals("Icon[]"))
			return new Object[] {new ImageIcon("src/practicas/bolaAzul.gif"), 
								new ImageIcon("src/practicas/bolaAmar.gif"), 
								new ImageIcon("src/practicas/bolaRoja.gif")};
		else if(s.equals("Object[]"))
			return new Object[] {cadenaMensaje,
								iconoMensaje, 
								componenteMensaje, 
								objetoMensaje};
		else
			return null;
	}
	
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//			System.out.println(laminaTipo.dameSeleccion());
			if(laminaTipo.dameSeleccion().equals("Mensaje"))
				JOptionPane.showMessageDialog(MarcoDialogos.this, 
						dameMensaje(), "Título", dameIcono());
			else if(laminaTipo.dameSeleccion().equals("Confirmar"))
				JOptionPane.showConfirmDialog(MarcoDialogos.this, 
						dameMensaje(), "Título", dameTipo(), dameIcono());
			else if(laminaTipo.dameSeleccion().equals("Opción"))
				JOptionPane.showOptionDialog(MarcoDialogos.this, 
						dameMensaje(), "Título", 0, dameIcono(), 
						null, dameOpciones(laminaOpciones), null);
			else if(laminaTipo.dameSeleccion().equals("Entrada"))
				if(laminaEntrada.dameSeleccion().equals("Campo de texto"))
					JOptionPane.showInputDialog(MarcoDialogos.this, 
							dameMensaje(), "Título", dameIcono());
				else
					JOptionPane.showInputDialog(MarcoDialogos.this, 
							dameMensaje(), "Título", dameIcono(), null, 
							new String[] {"Amarillo", "Azul", "Rojo"}, "Azul");
		}
		
	}
	
	private LaminaBotones laminaTipo, laminaTipoMensaje, laminaMensaje, 
		laminaTipoOpcion, laminaOpciones, laminaEntrada;
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("src/practicas/bolaAzulada.gif");
	private Object objetoMensaje = new Date();
	private Component componenteMensaje = new LaminaEjemplo();
	
}

class LaminaEjemplo extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, 
				getWidth(), getHeight());
		g2.setPaint(Color.YELLOW);
		g2.fill(rectangulo);
	}
	
	public LaminaEjemplo() {
		
	}
	
}