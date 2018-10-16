package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeerFicheroBuffer accediendo = new LeerFicheroBuffer();
		accediendo.lee();
	}

}

class LeerFicheroBuffer {
	
	public void lee() {
		try {
//			FileReader entrada = new FileReader("C:/Users/Trabajo/Desktop/texto.txt");
			FileReader entrada = new FileReader("src/texto.txt");
			BufferedReader miBuffer = new BufferedReader(entrada);
			String linea = miBuffer.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			miBuffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo.");
			e.printStackTrace();
		}
	}
	
}