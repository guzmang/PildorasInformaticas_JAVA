package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class PruebaDisposicionMuelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoMuelle miMarco = new MarcoMuelle();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMuelle extends JFrame {
	
	public MarcoMuelle() {
		setBounds(300, 200, 1000, 350);
		LaminaMuelle miLamina = new LaminaMuelle();
		add(miLamina);
		setVisible(true);
	}

}

class LaminaMuelle extends JPanel {
	
	public LaminaMuelle() {
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		SpringLayout miLayout = new SpringLayout();
		setLayout(miLayout);
		add(boton1);
		add(boton2);
		add(boton3);
		// valores que determinan la elasticidad (min, pref, max)
		Spring muelleElastico = Spring.constant(0, 10, 100);
		Spring muelleRigido = Spring.constant(100);
		// putConstraint(String e1, Component c1, Spring s, String e2, Component c2)
		// 1er arg: de donde empiezo (izquierda/derecha de un componente)
		// 2do arg: indico el componente desde donde empiezo
		// 3er arg: indico el muelle
		// 4to arg: donde termino (izquierda/derecha de un componente)
		// 5to arg: indico el componente donde termino
		miLayout.putConstraint(SpringLayout.WEST, boton1, muelleElastico, SpringLayout.WEST, this);
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, muelleElastico, SpringLayout.EAST, boton3);
		// Nota: Poner a todos con muelleElastico y ver resultado
	}
	
}