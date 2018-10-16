package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TiposCuadrosDialogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuadrosDialogos mimarco=new CuadrosDialogos();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class CuadrosDialogos extends JFrame{
	
	public CuadrosDialogos(){
		setBounds (500,300,400,250);	
		add(new LaminaCuadrosDialogos());
	}
	
}

class LaminaCuadrosDialogos extends JPanel{
	
	public LaminaCuadrosDialogos(){
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		boton3 = new JButton("Boton 3");
		boton4 = new JButton("Boton 4");
		
		boton1.addActionListener(new AccionBotones());
		boton2.addActionListener(new AccionBotones());
		boton3.addActionListener(new AccionBotones());
		boton4.addActionListener(new AccionBotones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
	}
	
	private class AccionBotones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == boton1)
				// 1er arg: componente padre (no pongo this solo porque haria referencia a la clase interna)
				// y la clase padre es a la que yo quiero hacer referencia
				// 2do arg: mensaje
//				JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this, "Mensaje de prueba");
				JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this,
						"Mensaje de prueba", "Advertencia", JOptionPane.WARNING_MESSAGE);
			else if(e.getSource() == boton2)
				JOptionPane.showInputDialog(LaminaCuadrosDialogos.this, 
						"Introduzca su nombre: ", "Introducción de datos", JOptionPane.INFORMATION_MESSAGE);
			else if(e.getSource() == boton3)
				JOptionPane.showConfirmDialog(LaminaCuadrosDialogos.this, 
						"Elige opción: ", "V Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
			else {
				String [] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
				JOptionPane.showOptionDialog(LaminaCuadrosDialogos.this, 
						"Elige: ", "V de opciones", JOptionPane.YES_NO_CANCEL_OPTION, 
						JOptionPane.QUESTION_MESSAGE, null, opciones, "Opción 2");
			}
		}
		
	}
	
	private JButton boton1, boton2, boton3, boton4;
	
}