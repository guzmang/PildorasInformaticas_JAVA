package leyendo_escribiendo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Como todo tipo de programa puede convertirse en una sucecion de bytes, con los streams byte
// Podemos manipular archivos de cualquier extension para guardarlos y despues recuperarlos
// Es mas comodo tener un flujo de bytes que despues se almacenara en un servidor

public class LeyendoEscribiendoBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int datosEntrada[] = new int[126646];
		try {
//			FileInputStream archivoLectura = new FileInputStream("C:/Users/Trabajo/Desktop/imagen.jpg");
			FileInputStream archivoLectura = new FileInputStream("src/imagen.jpg");
			boolean finalArchivo = false;
			while(!finalArchivo) {
				int byteEntrada = archivoLectura.read();
				if(byteEntrada != -1) {
					datosEntrada[contador] = byteEntrada;
					System.out.println(datosEntrada[contador]);
					contador++;
				}
				else
					finalArchivo = true;
			}
			archivoLectura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al acceder a la imagen.");
			e.printStackTrace();
		}
		System.out.println("Total bytes: " + contador);
		creaFichero(datosEntrada);
	}

	static void creaFichero(int[] datosNuevoFichero) {
		
		try {
//			FileOutputStream ficheroNuevo = new FileOutputStream("C:/Users/Trabajo/Desktop/imagen_copia.jpg");
			FileOutputStream ficheroNuevo = new FileOutputStream("src/imagen_copia.jpg");
			for(int i = 0; i < datosNuevoFichero.length; i++)
				ficheroNuevo.write(datosNuevoFichero[i]);
			ficheroNuevo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al crear el archivo.");
			e.printStackTrace();
		}
		
	}
	
}
