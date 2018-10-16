package ficheros_directorios;

import java.io.File;

public class PruebasRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Al no indicar una ruta como C:/Users/... lo que hace es tomar la carpeta del
		// proyecto como ruta por defecto
		File archivo = new File("ejemplo_archivo");
		System.out.println(archivo.getAbsolutePath());
		System.out.println(archivo.exists());
		File carpeta = new File("bin");
		System.out.println(carpeta.getAbsolutePath());
		System.out.println(carpeta.exists());
	}

}
