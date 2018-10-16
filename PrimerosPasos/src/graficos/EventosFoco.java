package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventosFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame {
	
	public MarcoFoco() {
		setVisible(true);
		setBounds(300, 300, 650, 400);
		add(new LaminaFoco());
	}
	
}

class LaminaFoco extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);	// invalida el posicionamiento por defecto de los componentes
		cuadro1 = new JTextField();
		cuadro2 = new JTextField();
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);
		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco);
	}
	
	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Has ganado el foco");
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			String email = cuadro1.getText();
			boolean comprobacion = false;
			
			for(int i = 0; i < email.length(); i++){
				if(email.charAt(i) == '@'){
					comprobacion = true;
				}
			}
			
			if(comprobacion)
				System.out.println("Mail correcto");
			else
				System.out.println("Mail incorrecto");
			
			System.out.println("Has perdido el foco");
		}
		
	}
	
	// las declaro aca para que, por un tema de ambito, pueda usarlas despues
	JTextField cuadro1;
	JTextField cuadro2;
	
}