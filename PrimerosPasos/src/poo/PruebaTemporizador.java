package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente = new DameLaHora();
//		ActionListener oyente = new DameLaHora();	// Otra alternativa
		Timer miTemporizador = new Timer(5000, oyente);
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulse aceptar para detener.");
		System.exit(0);
	}

}

class DameLaHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
		// Toolkit hace de puente entre nuestro SO, los recursos del SO (como los recursos de
		// Sonido, la resolucion de la pantalla, etc) y nuestros programas
		Toolkit.getDefaultToolkit().beep();
	}
	
}
