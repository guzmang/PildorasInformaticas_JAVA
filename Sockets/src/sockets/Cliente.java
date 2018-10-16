package sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		MarcoCliente miMarco = new MarcoCliente();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoCliente extends JFrame {
	
	public MarcoCliente() {	
		setBounds(600, 300, 280, 350);
		LaminaMarcoCliente miLamina = new LaminaMarcoCliente();
		add(miLamina);
		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel {
	
	public LaminaMarcoCliente() {
		JLabel texto = new JLabel("CLIENTE");
		add(texto);
		campo1 = new JTextField(20);
		add(campo1);
		miBoton = new JButton("Enviar");
		EnviaTexto miEvento = new EnviaTexto();
		miBoton.addActionListener(miEvento);
		add(miBoton);
	}		
	
	private class EnviaTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				// Direccion de IP del servidor y puerto en el constructor del socket
				Socket miSocket = new Socket("192.168.0.9", 9999);
				DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
				flujoSalida.writeUTF(campo1.getText());
				flujoSalida.close();
				miSocket.close();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				// IP mal, ocupada, congestion en la red y tarde en contestar, etc
				System.out.println(e1.getMessage());
			}
		}
		
	}
	
	private JTextField campo1;
	private JButton miBoton;
	
}