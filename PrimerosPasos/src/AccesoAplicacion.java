import javax.swing.JOptionPane;

public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Juan";
		String pass = "";
		
		while(clave.equals(pass) == false){
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			if(clave.equals(pass) == false){
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña correcta. Acceso permitido.");
	}

}
