package excepciones1;

import javax.swing.JOptionPane;

public class CompruebaMailMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = JOptionPane.showInputDialog("Introduci el mail");
		try {
			examinaMail(mail);
		} catch(Exception e) {
			System.out.println("La direccion ingresada es demasiado corta.");
			e.printStackTrace();	// Nos imprime la pila de llamadas del error
									// Sabremos el tipo de la clase que genero la excepcion y mje
		}
	}

	static void examinaMail(String mail) throws LongitudDeMailErronea {
		int arroba = 0;
		boolean punto = false;
		if(mail.length() <= 3) {
			throw new LongitudDeMailErronea("El mail no puede tener menos de 3 caracteres");
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

// Cuando se crea una excepcion propia, se recomienda tener estos 2 constructores
// Uno sin args y otro con un parametro String
class LongitudDeMailErronea extends Exception {
	
	public LongitudDeMailErronea() {
		
	}
	
	// Este mensaje nos dara pistas de que fallo cuando salen los mensajes en rojo
	public LongitudDeMailErronea(String msjError) {
		super(msjError);	// se llama al constructor de la clase Exception
	}
	
}