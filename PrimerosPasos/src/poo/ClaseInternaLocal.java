package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ClaseInternaLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj2 miReloj = new Reloj2();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "Pulse aceptar para terminar.");
		System.exit(0);
		
	}

}

class Reloj2 {
	
	public void enMarcha(int intervalo, boolean sonido) {
		
		// las variables locales que vaya a utilizar la clase local interna deben ser
		// declarada como final
		// Nota: con jre 1.8 no hace falta indicar final boolean sonido
		class DameLaHora3 implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
				if(sonido)
					Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		ActionListener oyente = new DameLaHora3();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
}