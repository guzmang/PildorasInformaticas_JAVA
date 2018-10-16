package excepciones1;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma operacion1 = new Suma();
		Resta operacion2 = new Resta();
		Divide operacion3 = new Divide();
		Multiplica operacion4 = new Multiplica();
		System.out.println(operacion1.calculo(7, 8));
		System.out.println(operacion2.calculo(7, 8));
		System.out.println(operacion3.calculo(7, 8));
		System.out.println(operacion4.calculo(7, 8));
	}

}