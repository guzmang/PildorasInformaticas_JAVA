package controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.CargaMenus;
import vista.MarcoAplicacion;

// Extiende de WindowAdapter en vez de implementar WindowListener
// para no cargar la clase de metodos que no necesitamos

public class ControladorCargaMenus extends WindowAdapter {

	public ControladorCargaMenus(MarcoAplicacion elMarco) {
		this.elMarco = elMarco;
	}
	
	public void windowOpened(WindowEvent e) {
		cargaSecciones.ejecutaConsultas();
		try {
			
			ResultSet rsSecciones = cargaSecciones.getRsSecciones();
			ResultSet rsPaises = cargaSecciones.getRsPaises();
			
			while(rsSecciones.next()){
				elMarco.getSecciones().addItem(rsSecciones.getString(1));
			}
			
			while(rsPaises.next()){
				elMarco.getPaises().addItem(rsPaises.getString(1));
			}
			
			rsSecciones.close();
			rsPaises.close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private CargaMenus cargaSecciones = new CargaMenus();
	private MarcoAplicacion elMarco;
	
}
