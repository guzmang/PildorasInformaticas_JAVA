package sockets;

import java.awt.BorderLayout;

import java.io.DataInputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoServidor miMarco = new MarcoServidor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor() {
		setBounds(900, 300, 280, 350);
		JPanel miLamina = new JPanel();
		miLamina.setLayout(new BorderLayout());
		areaTexto = new JTextArea();
		miLamina.add(areaTexto,BorderLayout.CENTER);
		add(miLamina);
		setVisible(true);
		Thread miHilo = new Thread(this);
		miHilo.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			// Crea un socket de server indicando el puerto por el que debe escuchar
			@SuppressWarnings("resource")
			ServerSocket servidor = new ServerSocket(9999);
			
			while(true) {
				// Escucha la conexion que se hara y la acepta
				Socket miSocket = servidor.accept();
				
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				String mensajeTexto = flujoEntrada.readUTF();
				flujoEntrada.close();
				areaTexto.append(mensajeTexto + "\n");
				miSocket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private	JTextArea areaTexto;

}