package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj miReloj = new Reloj(3000, true);
		miReloj.enMarcha();
		JOptionPane.showMessageDialog(null, "Pulse aceptar para terminar.");
		System.exit(0);
		
	}

}

class Reloj {
	
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}
	
	public void enMarcha() {
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	private int intervalo;
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Date ahora = new Date();
			System.out.println("Te pongo la hora cada 3 segundos: " + ahora);
			if(sonido)
				Toolkit.getDefaultToolkit().beep();
		}
		
	}
	
}