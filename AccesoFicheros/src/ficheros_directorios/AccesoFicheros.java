package ficheros_directorios;

import java.io.File;

public class AccesoFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File.separator() es el separador que usa el SO de nuestro equipo
		// nos aseguramos de escribir bien la ruta cuando no sepamos que barra usar
//		String s = File.separator;
//		File ruta = new File("C:" + s + "Users" + s + "Trabajo" + s + "Desktop");
		
		File ruta = new File("src");
		System.out.println(ruta.getAbsolutePath());
		String[] nombresArchivos = ruta.list();
		
		for(int i = 0; i < nombresArchivos.length; i++) {
			System.out.println(nombresArchivos[i]);
			
			// 1er arg: parent, 2do arg: child
			File f = new File(ruta.getAbsolutePath(), nombresArchivos[i]);
			
			// Si el archivo es directorio, imprimo sus archivos
			if(f.isDirectory()) {
				String[] archivosSubcarpeta = f.list();
				for(int j = 0; j < archivosSubcarpeta.length; j++)
					System.out.println(archivosSubcarpeta[j]);
			}
			
		}
	}

}