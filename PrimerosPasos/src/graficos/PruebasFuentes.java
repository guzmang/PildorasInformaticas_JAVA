package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class PruebasFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce Fuente: ");
		boolean estaLaFuente = false;
		
		// getLocalGraphicsEnvironment() obtengo el entorno grafico local
		// getAvailableFontFamilyNames() obtengo las fuentes que tengo disponible en mi SO
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames();
		
		for(String nombreDeLaFuente: nombresDeFuentes){
			System.out.println(nombreDeLaFuente);
			if(nombreDeLaFuente.equals(fuente))
				estaLaFuente = true;
		}
		
		if(estaLaFuente)
			System.out.println("Fuente instalada");
		else
			System.out.println("No esta instalada la fuente");
	}

}
