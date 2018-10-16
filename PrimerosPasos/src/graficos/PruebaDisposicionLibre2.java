package graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaDisposicionLibre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLibre2 miMarco = new MarcoLibre2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLibre2 extends JFrame {
	
	public MarcoLibre2() {
		setBounds(450, 350, 600, 400);
		LaminaLibre2 miLamina = new LaminaLibre2();
		add(miLamina);
		setVisible(true);
	}

}

class LaminaLibre2 extends JPanel {
	
	public LaminaLibre2() {
		setLayout(new EnColumnas());
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel telefono = new JLabel("Teléfono: ");
		JTextField cNombre = new JTextField();
		JTextField cApellido = new JTextField();
		JTextField cEdad = new JTextField();
		JTextField cTelefono = new JTextField();
		add(nombre);
		add(cNombre);
		add(apellido);
		add(cApellido);
		add(edad);
		add(cEdad);
		add(telefono);
		add(cTelefono);
	}
	
}

class EnColumnas implements LayoutManager {
	
	public EnColumnas() {
		
	}

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container miContenedor) {
		// TODO Auto-generated method stub
		int d = miContenedor.getWidth();
		x = d/2;
		y = 20;
		int contador = 0;
		int n = miContenedor.getComponentCount();
		for(int i = 0; i < n; i++) {
			contador++;
			Component c = miContenedor.getComponent(i);
			c.setBounds(x - 100, y, 100, 20);
			x += 100;
			if(contador % 2 == 0) {
				x = d/2;
				y += 40;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	private int y;
	
}