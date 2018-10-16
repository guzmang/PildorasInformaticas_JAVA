
public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre = "Juan";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		int ultimaLetra;
		ultimaLetra = nombre.length();
		System.out.println("Y ultima letra es " + nombre.charAt(ultimaLetra-1));
		
		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		String fraseResumen = frase.substring(1, 4);  // oy
		System.out.println(fraseResumen);
		fraseResumen = frase.substring(0, 28) + " irnos a la playa y olvidarnos de todo..." 
				+ " y " + frase.substring(29, 57);
		System.out.println(fraseResumen);
		
		String alumno1, alumno2;
		alumno1 = "David";
		alumno2 = "David";
		System.out.println(alumno1.equals(alumno2));
		alumno2 = "david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));		
	}
}
