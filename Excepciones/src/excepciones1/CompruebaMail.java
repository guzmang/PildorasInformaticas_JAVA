package excepciones1;

import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = JOptionPane.showInputDialog("Introduci el mail");
		try {
			examinaMail(mail);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("La direccion ingresada es demasiado corta.");
		}
	}

	// Indico la excepcion que el metodo puede llegar a tirar
	static void examinaMail(String mail) throws ArrayIndexOutOfBoundsException {
		int arroba = 0;
		boolean punto = false;
		// Lo ideal es buscar una excepcion que se adapte a esta condicion
		// La excepcion elegida es a fines practicos para entender
		if(mail.length() <= 3) {
			// Generamos una excepcion intencionalmente
//			ArrayIndexOutOfBoundsException miExcepcion = new ArrayIndexOutOfBoundsException();
//			throw miExcepcion;
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for(int i = 0; i < mail.length(); i++){
				if(mail.charAt(i) == '@'){
					arroba++;
				}
				if(mail.charAt(i) == '.'){
					punto = true;
				}
			}
			if(arroba == 1 && punto == true){
				System.out.println("Es correcto.");
			} else {
				System.out.println("No es correcto.");
			}
		}
	}
	
}
