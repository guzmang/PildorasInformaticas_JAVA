package escribiendo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EscribiendoBuffer accedeEscritura = new EscribiendoBuffer();
		accedeEscritura.escribir();
	}

}

class EscribiendoBuffer {
	
	public void escribir() {
		String frase = "Esto es una prueba de escritura.";
		try {
//			FileWriter escritura = new FileWriter("C:/Users/Trabajo/Desktop/texto_nuevo.txt");
			FileWriter escritura = new FileWriter("src/texto_nuevo.txt");
			BufferedWriter miBuffer = new BufferedWriter(escritura);
			miBuffer.write(frase);
			miBuffer.close();	// Si no se cierra el Buffer el archivo estara en blanco
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}