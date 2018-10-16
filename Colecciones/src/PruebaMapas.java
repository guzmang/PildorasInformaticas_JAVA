import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		System.out.println(personal);
		
		personal.remove("147");
		System.out.println(personal);
		
		personal.put("148", new Empleado("Natalia"));
		System.out.println(personal);
		
		System.out.println(personal.entrySet());
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave = " + clave + ", Valor = " + valor);
		}
		
	}

}

class Empleado {
	
	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;
	}
	
	public String toString() {
		return "[Nombre = " + nombre + ", sueldo = " + sueldo + "]";
	}
	
	private String nombre;
	private double sueldo;
	
}