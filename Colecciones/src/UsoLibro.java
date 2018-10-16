
public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("P en Java", "Juan", 25);
		Libro libro2 = new Libro("P en Java", "Juan", 25);
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
		else {
			System.out.println("No es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}

	}

}
