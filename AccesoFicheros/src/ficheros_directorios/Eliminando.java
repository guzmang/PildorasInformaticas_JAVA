package ficheros_directorios;

import java.io.File;

public class Eliminando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para eliminar una carpeta, primero se define una "ruta" + "carpeta_a_borrar"
//		File rutaCarpeta = new File("C:" + File.separator + "Users" + File.separator + "Trabajo" + 
//				File.separator + "Desktop" + File.separator + "nuevo_directorio");
		File rutaCarpeta = new File("src" + File.separator + "nuevo_directorio");
		// true: si la borra, false: cualquier otro resultado
		boolean carpetaBorrada = rutaCarpeta.delete();
		System.out.println("Carpeta borrada: " + carpetaBorrada);
		
		// Para borrar un archivo, primero se define una "ruta" + "nombre.extension" a borrar
//		File rutaArchivo = new File("C:" + File.separator + "Users" + File.separator + "Trabajo" + 
//				File.separator + "Desktop" + File.separator + "prueba_texto.txt");
		File rutaArchivo = new File("src" + File.separator + "prueba_texto.txt");
		// true: si lo borra, false: cualquier otro resultado
		boolean archivoBorrado = rutaArchivo.delete();
		System.out.println("Archivo borrado: " + archivoBorrado);
	}

}
