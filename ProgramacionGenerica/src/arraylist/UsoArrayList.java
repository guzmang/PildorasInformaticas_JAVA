package arraylist;

import java.io.File;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList nombres = new ArrayList(4);
		nombres.add("Juan");
		nombres.add("Maria");
		nombres.add("Ana");
		nombres.add("Sandra");
//		nombres.add(new File("gestion_pedidos.accdb")); // Esto no deberia ser posible ya que
		// al momento de usar un get, debido al casting no se podra hacer un File to String
		
		String nombrePersona = (String) nombres.get(2);
		System.out.println(nombrePersona);
		
		ArrayList archivos = new ArrayList(4);
		archivos.add(new File("gestion_pedidos.accdb"));
		File nombreArchivo = (File) archivos.get(0);
		System.out.println(nombreArchivo);
	}

}
