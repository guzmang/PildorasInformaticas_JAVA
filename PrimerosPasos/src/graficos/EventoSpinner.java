package graficos;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class EventoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoSpinner2 miMarco = new MarcoSpinner2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}

class MarcoSpinner2 extends JFrame {
	
	public MarcoSpinner2() {
		setBounds(550, 350, 550, 350);
		add(new LaminaSpinner2());
	}
	
}

class LaminaSpinner2 extends JPanel {
	
	public LaminaSpinner2() {
//		JSpinner control1 = new JSpinner(new MiModeloJSpinner());
		JSpinner control1 = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {
			public Object getNextValue() {
				return super.getPreviousValue();
			}
		
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		Dimension d = new Dimension(150, 20);
		control1.setPreferredSize(d);
		add(control1);
	}
	
//	private class MiModeloJSpinner extends SpinnerNumberModel {
//		
//		public MiModeloJSpinner() {
//			super(5, 0, 10, 1);
//		}
//		
//		public Object getNextValue() {
//			return super.getPreviousValue();
//		}
//		
//		public Object getPreviousValue() {
//			return super.getNextValue();
//		}
//		
//	}
}