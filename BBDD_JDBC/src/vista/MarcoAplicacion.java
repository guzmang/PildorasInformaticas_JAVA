package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controlador.ControladorBotonConsulta;
import controlador.ControladorCargaMenus;

public class MarcoAplicacion extends JFrame {

	public MarcoAplicacion(){
		setTitle("Consulta BBDD");
		setBounds(500, 300, 400, 400);
		setLayout(new BorderLayout());
		
		JPanel menus = new JPanel();
		menus.setLayout(new FlowLayout());
		
		secciones = new JComboBox<String>();
		secciones.setEditable(false);
		secciones.addItem("Todos");
		
		paises = new JComboBox<String>();
		paises.setEditable(false);
		paises.addItem("Todos");
		
		menus.add(secciones);
		menus.add(paises);
		add(menus, BorderLayout.NORTH);
		
		resultado = new JTextArea(4, 50);
		resultado.setEditable(false);
		resultado.setLineWrap(true);
		add(resultado, BorderLayout.CENTER);
		
		scroll = new JScrollPane(resultado);
		add(scroll);
		
		JButton botonConsulta = new JButton("Consulta");	
		botonConsulta.addActionListener(new ControladorBotonConsulta(this));
		add(botonConsulta, BorderLayout.SOUTH);
		
		// Ponemos a la escucha el evento creado en el paquete controlador
		addWindowListener(new ControladorCargaMenus(this));
	}
	
	public JComboBox<String> getSecciones() {
		return secciones;
	}
	
	public JComboBox<String> getPaises() {
		return paises;
	}

	public JTextArea getResultado() {
		return resultado;
	}

	private JComboBox<String> secciones;
	private JComboBox<String> paises;
	private JTextArea resultado;
	private JScrollPane scroll;
	
}
