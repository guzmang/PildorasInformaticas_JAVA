
public class CalculosConMath {

	public static void main(String[] args) {
		// srqt espera y recibe un double
		double raiz = Math.sqrt(9);
		System.out.println(raiz);
		float num1 = 5.85F;
		int resultado = Math.round(num1);
		System.out.println(resultado);
		double num2 = 5.85;
		resultado = (int)Math.round(num2);	// devuelve double
		System.out.println(resultado);
		double base = 5;
		double exponente = 3;
		resultado = (int)Math.pow(base, exponente);	// devuelve double
		System.out.println(resultado);
		
		double a = 3;
		double b = 4;
		double h = 5;
		double seno = Math.sin(a/h);
		double arcSeno = Math.asin(seno);
		System.out.println(seno);
		System.out.println(arcSeno);
		double coseno = Math.cos(b/h);		
		double arcCos = Math.acos(coseno);
		System.out.println(coseno);
		System.out.println(arcCos);
		double tangente = Math.cos(a/b);		
		double arcTan = Math.acos(tangente);
		System.out.println(tangente);
		System.out.println(arcTan);
	}
	
}
