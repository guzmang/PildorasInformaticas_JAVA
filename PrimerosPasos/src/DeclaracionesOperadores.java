
public class DeclaracionesOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b;
		b = 7;
		int c = b + a;
		System.out.println("c: " + c);
		System.out.println("c++ " + c++);
		System.out.println("++c " + ++c);
		System.out.println(c+=6);
		int d = 4;
		int e = 10;
		double f = e/d;
		System.out.println(f); // 2.0, d y e deben ser doubles tambien
		final double apulgadas = 2.54;
		final double cm = 6;
		final double resultado = cm/apulgadas;
		System.out.println("En " + cm + "cm hay " + resultado + " pulgadas");
	}

}
