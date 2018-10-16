package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para crear una carpeta, primero se define una "ruta" + "nombre_deseado"
//		File rutaCarpeta = new File("C:" + File.separator + "Users" + File.separator + "Trabajo" + 
//				File.separator + "Desktop" + File.separator + "nuevo_directorio");
		File rutaCarpeta = new File("src" + File.separator + "nuevo_directorio");
		// true: si la crea, false: si ya existe o cualquier otro resultado
		boolean carpetaCreada = rutaCarpeta.mkdir();
		System.out.println("Carpeta creada: " + carpetaCreada);
		
		// Para crear un archivo, primero se define una "ruta" + "nombre.extension" deseado
//		File rutaArchivo = new File("C:" + File.separator + "Users" + File.separator + "Trabajo" + 
//				File.separator + "Desktop" + File.separator + "prueba_texto.txt");
		File rutaArchivo = new File("src" + File.separator + "prueba_texto.txt");
		String archivoDestino = rutaArchivo.getAbsolutePath();
		try {
			// true: si la crea, false: si ya existe
			boolean archivoCreado = rutaArchivo.createNewFile();
			System.out.println("Archivo creado: " + archivoCreado);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido crear el archivo.");
			e.printStackTrace();
		}
		// creo y escribo, si ya existe lo abre y escribe en el
		Escribiendo accedeEscritura = new Escribiendo();
		accedeEscritura.escribir(archivoDestino);
	}

}

class Escribiendo {
	
	public void escribir(String rutaArchivo) {
		String frase = "Esto es un ejemplo. Espero que todo salga bien.";
		try {
			FileWriter escritura = new FileWriter(rutaArchivo);
			escritura.write(frase);
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido escribir en el archivo.");
			e.printStackTrace();
		}
	}
	
}
