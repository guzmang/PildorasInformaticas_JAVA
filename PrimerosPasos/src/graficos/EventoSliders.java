package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EventoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSliders2 miMarco = new MarcoSliders2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoSliders2 extends JFrame {
	
	public MarcoSliders2() {
		setBounds(550, 400, 550, 350);
		LaminaSliders2 miLamina = new LaminaSliders2();
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaSliders2 extends JPanel {
	
	public LaminaSliders2() {
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		add(rotulo, BorderLayout.CENTER);
		control = new JSlider(6, 50, 12);
		control.setMajorTickSpacing(22);
		control.setMinorTickSpacing(2);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font("Serif", Font.ITALIC, 10));
		control.addChangeListener(new EventoSlider());
		JPanel laminaSlider = new JPanel();
		laminaSlider.add(control);
		add(laminaSlider, BorderLayout.NORTH);
	}
	
	private class EventoSlider implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
		}
		
	}
	
	private JLabel rotulo;
	private JSlider control;
	
}