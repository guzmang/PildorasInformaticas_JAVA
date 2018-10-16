package practicas;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LaminaBotones extends JPanel {

	public LaminaBotones(String titulo, String[] opciones) {
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));	// Y_AXIS: componentes en su interior de arriba a abajo
		grupo = new ButtonGroup();
		for(int i = 0; i < opciones.length; i++){
			JRadioButton btn = new JRadioButton(opciones[i]);
			btn.setActionCommand(opciones[i]);	// seteo texto que devuelve con getActionCommand()
			grupo.add(btn);
			add(btn);
			btn.setSelected(i == 0);
		}
	}
	
	public String dameSeleccion() {
		ButtonModel miBtn = grupo.getSelection();	// obtenemos el btn seleccionado del grupo
		String s = miBtn.getActionCommand();		// obtenemos el texto de setActionCommand();
		return s;
	}
	
	private ButtonGroup grupo;
	
}
