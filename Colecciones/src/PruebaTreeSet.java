import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ordenaPersonas = new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		for(String s: ordenaPersonas)
			System.out.println(s);
		
		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(200, "Segundo articulo");
		Articulo tercer = new Articulo(3, "Este es el tercer articulo");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(tercer);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo art: ordenaArticulos)
			System.out.println(art.getDescripcion());
		
		/********** Otra solucion **********/
		
		// Creo el comparador con interfaz comparator
		Articulo comparadorArticulos = new Articulo();
		// Directamente mira el metodo compare para ver criterio de comparacion
		// Ordena alfabeticamente
		TreeSet<Articulo> ordenaArticulosDos = new TreeSet<Articulo>(comparadorArticulos);
		
		ordenaArticulosDos.add(primero);
		ordenaArticulosDos.add(segundo);
		ordenaArticulosDos.add(tercer);
		
		for(Articulo art: ordenaArticulosDos)
			System.out.println(art.getDescripcion());
		
		/********** Solucion optima **********/
		
		// El articulo no se ve obligado a implementar Comparable o Comparator
		ComparadorArticulos comparaArt = new ComparadorArticulos();
		Articulo2 primero2 = new Articulo2(1, "Primer articulo");
		Articulo2 segundo2 = new Articulo2(200, "Segundo articulo");
		Articulo2 tercero2 = new Articulo2(3, "Este es el tercer articulo");
		TreeSet<Articulo2> ordenaArticulos2 = new TreeSet<>(comparaArt);
		ordenaArticulos2.add(primero2);
		ordenaArticulos2.add(segundo2);
		ordenaArticulos2.add(tercero2);
		
		for(Articulo2 art: ordenaArticulos2)
			System.out.println(art.getDescripcion());
		
		/********** Solucion optima (con clase interna anonima de Comparator) **********/

		TreeSet<Articulo2> ordenaArticulos3 = new TreeSet<>(new Comparator<Articulo2>() {

			@Override
			public int compare(Articulo2 o1, Articulo2 o2) {
				// TODO Auto-generated method stub
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
				return desc1.compareTo(desc2);
			}
			
		});
		
		ordenaArticulos3.add(primero2);
		ordenaArticulos3.add(segundo2);
		ordenaArticulos3.add(tercero2);
		
		for(Articulo2 art: ordenaArticulos3)
			System.out.println(art.getDescripcion());
		
	}
	
}

// El TreeSet ordena en base al metodo compareTo de la interfaz Comparable
class Articulo implements Comparable<Articulo>, Comparator<Articulo> {
	
	public Articulo() {

	}

	public Articulo(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}
	
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String descA = o1.getDescripcion();
		String descB = o2.getDescripcion();
		return descA.compareTo(descB);
	}
	
	private int numero_articulo;
	private String descripcion;
	
}

class Articulo2 {

	public Articulo2(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public int getNumeroArticulo() {
		return numero_articulo;
	}
	
	private int numero_articulo;
	private String descripcion;
	
}

// Creamos una clase nueva para no obligar a la clase (que quizas no
// creamos nosotros) que construye los objetos a implementar Comparator
class ComparadorArticulos implements Comparator<Articulo2> {

	@Override
	public int compare(Articulo2 o1, Articulo2 o2) {
		// TODO Auto-generated method stub
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
		return desc1.compareTo(desc2);
	}
	
}