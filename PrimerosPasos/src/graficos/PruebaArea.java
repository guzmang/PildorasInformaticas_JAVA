package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea miMarco = new MarcoPruebaArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}
	
}

class MarcoPruebaArea extends JFrame {
	
	public MarcoPruebaArea() {
		setTitle("Probando Area de texto");
		setBounds(500, 300, 500, 350);
		setLayout(new BorderLayout());
		laminaBotones = new JPanel();
		btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme... ");
			}
			
		});
		laminaBotones.add(btnInsertar);
		btnSaltoLinea = new JButton("Salto Linea");
		btnSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				btnSaltoLinea.setText(saltar? "Quitar Salto" : "Salto Linea");
			}
			
		});
		laminaBotones.add(btnSaltoLinea);
		add(laminaBotones, BorderLayout.SOUTH);
		areaTexto = new JTextArea(8, 20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras, BorderLayout.CENTER);
	}
	
	private JPanel laminaBotones;
	private JButton btnInsertar, btnSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	
}