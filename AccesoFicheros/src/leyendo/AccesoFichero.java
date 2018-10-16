package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFichero accediendo = new LeerFichero();
		accediendo.lee();
	}

}

class LeerFichero {
	
	public void lee() {
		try {
//			FileReader entrada = new FileReader("C:/Users/Trabajo/Desktop/texto.txt");
			FileReader entrada = new FileReader("src/texto.txt");
			int c = entrada.read();
			while(c != -1) {
				char letra = (char) c;
				System.out.print(letra);
				c = entrada.read();
			}
			entrada.close();
		} catch (IOException e) {	// reemplazo con esta linea para que tambien capture entrada.read()
//		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo.");
			e.printStackTrace();
		}
	}
	
}
